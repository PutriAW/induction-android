package com.example.replikalivin.viewmodel

import androidx.lifecycle.*
//import com.example.replikalivin.NewsApplication

import com.example.replikalivin.model.article
import com.example.replikalivin.model.retrofit.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


class NewsViewModel @Inject constructor(val apiService : RetrofitInstance) : ViewModel() {
    val articles = MutableLiveData<List<article>>()
    val isLoading = MutableLiveData<Boolean>()
    val errorMsg = MutableLiveData<Throwable>()


    fun callAPI(page: Int){
        viewModelScope.launch(Dispatchers.IO){
            isLoading.postValue(true)
            try {

                val news = apiService.provideGetApiEndPoint().getListNews("food", "4f1a24dc5e424e10aacb9aaaa8293c1a", 10, page)

                if (news.isSuccessful){
                    isLoading.postValue(false)
                    articles.postValue(news.body()!!.articles)
                }
            }catch (e: Throwable){
                    isLoading.postValue(false)
                    errorMsg.postValue(e)
            }

        }
    }


}