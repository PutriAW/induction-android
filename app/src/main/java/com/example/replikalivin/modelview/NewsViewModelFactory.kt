package com.example.replikalivin.modelview

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.replikalivin.model.retrofit.ApiEndpoint
import javax.inject.Inject
import javax.inject.Provider

class NewsViewModelFactory @Inject constructor(private val viewModelMap: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelMap[modelClass]?.get() as T
    }
}