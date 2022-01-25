package com.example.replikalivin.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.replikalivin.databinding.ListNewsBinding
import com.example.replikalivin.model.article

class  NewsRecycleViewAdapter(): RecyclerView.Adapter<NewsRecycleViewAdapter.ListViewHolder>(){
    private val listNews: MutableList<article> = arrayListOf()

    class ListViewHolder(val binding: ListNewsBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ListNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.binding.newsTitle.text = listNews[position].title
        Glide.with(holder.binding.root)
            .load(listNews[position].urlToImage)
            .apply(RequestOptions().override(60, 60))
            .into(holder.binding.newsImg)
        holder.binding.newsSource.text = listNews[position].source.name
        holder.binding.newsAuthor.text = listNews[position].author
        holder.binding.root.setOnClickListener(){
            val moveIntent = Intent(Intent.ACTION_VIEW, Uri.parse(listNews[position].url))
            startActivity(it.context, moveIntent, null)
        }
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    fun addList(item : List<article>){
        listNews.addAll(item)
        notifyDataSetChanged()
    }

    fun clear(){
        listNews.clear()
        notifyDataSetChanged()
    }

}