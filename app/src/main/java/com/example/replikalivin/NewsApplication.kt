//package com.example.replikalivin
//
//import android.app.Application
//import com.example.replikalivin.di.component.DaggerNetworkComponent
//import com.example.replikalivin.di.component.NetworkComponent
//import com.example.replikalivin.model.retrofit.RetrofitInstance
//
//class NewsApplication: Application() {
//
//    private lateinit var networkComponent: NetworkComponent
//
//    override fun onCreate() {
//        super.onCreate()
//
//        networkComponent = DaggerNetworkComponent.builder().retrofitInstance(RetrofitInstance()).build()
//    }
//
//    fun getNetworkComponent(): NetworkComponent{
//        return networkComponent
//    }
//}