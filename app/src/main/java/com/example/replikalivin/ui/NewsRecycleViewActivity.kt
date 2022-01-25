package com.example.replikalivin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.replikalivin.adapter.NewsRecycleViewAdapter
import com.example.replikalivin.databinding.ActivityNewsRecycleViewBinding
import com.example.replikalivin.di.component.DaggerAppComponent
//import com.example.replikalivin.di.component.DaggerNetworkComponent
import com.example.replikalivin.model.retrofit.ApiEndpoint
import com.example.replikalivin.modelview.NewsViewModel
import com.example.replikalivin.modelview.NewsViewModelFactory
import javax.inject.Inject

class NewsRecycleViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsRecycleViewBinding
    private lateinit var viewModel : NewsViewModel
    private lateinit var listNewsAdapter : NewsRecycleViewAdapter
    private lateinit var refreshPage : SwipeRefreshLayout
    private val layoutManager = LinearLayoutManager(this)

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        var page = 1
        super.onCreate(savedInstanceState)
        binding = ActivityNewsRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Action Bar
        val actionBar = supportActionBar

        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayShowTitleEnabled(true)
        actionBar?.setTitle("News")
        supportActionBar?.elevation = 0f

        binding.listNRV.layoutManager = layoutManager

        // Builder for dagger
//        DaggerNetworkComponent.builder().build().inject(this)

        // View Model Section
//        viewModel = ViewModelProvider(this).get(NewsViewModel::class.java)

        DaggerAppComponent.builder().build().inject(this)
        viewModel = ViewModelProvider(this, factory)[NewsViewModel::class.java]
        viewModel.callAPI(page)
        loadNews()

        refreshPage = binding.refreshNews

        viewModel.articles.observe(this, {
            listNewsAdapter.addList(it)
        })

        viewModel.errorMsg.observe( this, {
            Toast.makeText(this@NewsRecycleViewActivity, "${it.message}", Toast.LENGTH_LONG).show()
        })

        viewModel.isLoading.observe(this, {
            showLoading(it)
        })

        refreshPage.setOnRefreshListener {
            refreshPage.isRefreshing = false
            page = 1
            listNewsAdapter.clear()
            viewModel.callAPI(page)
        }

        binding.listNRV.addOnScrollListener(object: RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                if(layoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.itemCount - 1){
                    page++
                    viewModel.callAPI(page)
                    Log.d("PAGE", "Page: $page")
                }
                super.onScrolled(recyclerView, dx, dy)
            }
        })
    }

    fun loadNews(){
        listNewsAdapter = NewsRecycleViewAdapter()
        binding.listNRV.adapter = listNewsAdapter
    }

    fun showLoading(isLoading : Boolean){
        if (isLoading){
            binding.progressBar.visibility = View.VISIBLE
        }else{
            binding.progressBar.visibility = View.GONE
        }
    }

}