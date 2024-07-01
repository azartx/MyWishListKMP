package com.solo4.mywishlist

import com.solo4.mywishlist.di.appComponent
import org.koin.core.context.startKoin

@Suppress("FunctionName")
fun WishListApp() {
    startKoin {
        modules(appComponent)
    }
}