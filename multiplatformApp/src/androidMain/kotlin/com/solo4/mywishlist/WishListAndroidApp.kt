package com.solo4.mywishlist

import android.app.Application
import android.content.Context
import com.solo4.mywishlist.di.platformAppComponent
import org.koin.dsl.bind

class WishListAndroidApp : Application() {

    override fun onCreate() {
        super.onCreate()

        platformAppComponent.apply {
            single { this@WishListAndroidApp } bind Context::class
        }
        WishListApp()
    }
}