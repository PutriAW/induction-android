package com.example.replikalivin.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.replikalivin.modelview.NewsViewModel
import com.example.replikalivin.modelview.NewsViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: NewsViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelMapKey(NewsViewModel::class)
    abstract fun bindViewModel(newsViewModel: NewsViewModel): ViewModel


}