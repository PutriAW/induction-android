package com.example.replikalivin.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.replikalivin.adapter.NewsRecycleViewAdapter
import com.example.replikalivin.databinding.FragmentNewsRecyclerViewBinding
import com.example.replikalivin.di.component.DaggerAppComponent
import com.example.replikalivin.viewmodel.NewsViewModel
import javax.inject.Inject

class NewsRecyclerViewFragment : Fragment() {
    private lateinit var binding: FragmentNewsRecyclerViewBinding
    private lateinit var viewModel : NewsViewModel
    private lateinit var listNewsAdapter : NewsRecycleViewAdapter
    private lateinit var refreshPage : SwipeRefreshLayout

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsRecyclerViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val layoutManager = LinearLayoutManager(view.context)
        var page = 1

        super.onViewCreated(view, savedInstanceState)

        val homebaseActivity = activity as HomebaseActivity
        homebaseActivity.actionBar?.show()

        homebaseActivity.actionBar?.setDisplayHomeAsUpEnabled(true)
        homebaseActivity.actionBar?.setDisplayShowTitleEnabled(true)
        homebaseActivity.actionBar?.setTitle("News")
        homebaseActivity.actionBar?.elevation = 0f

        binding.listNRV.layoutManager = layoutManager

        DaggerAppComponent.builder().build().inject(this)
        viewModel = ViewModelProvider(this, factory)[NewsViewModel::class.java]
        viewModel.callAPI(page)
        loadNews()

        refreshPage = binding.refreshNews

        viewModel.articles.observe(this, {
            listNewsAdapter.addList(it)
        })

        viewModel.errorMsg.observe( this, {
            Toast.makeText(view.context, "${it.message}", Toast.LENGTH_LONG).show()
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