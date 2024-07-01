package com.solo4.mywishlist.entrypoint.impl

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.solo4.mywishlist.theme.api.MyWishListTheme
import org.koin.mp.KoinPlatformTools

@Composable
fun EntryPointApp() {
    val theme = remember { KoinPlatformTools.defaultContext().get().get<MyWishListTheme>() }

    theme.setContent {
        // TODO init navigation
    }
}