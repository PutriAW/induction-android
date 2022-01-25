package com.example.replikalivin.di.component

import com.example.replikalivin.di.ViewModelModule
import com.example.replikalivin.ui.NewsRecycleViewActivity
import dagger.Component

@Component(modules = [ViewModelModule::class])
interface AppComponent{
    fun inject(newsRecycleViewActivity: NewsRecycleViewActivity)
}