package com.solo4.mywishlist.theme.impl

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.solo4.mywishlist.theme.api.MyWishListTheme

class MyWishListThemeImpl : MyWishListTheme {

    @Composable
    override fun setContent(content: @Composable () -> Unit) {
        MaterialTheme {
            CompositionLocalProvider(
                content = content
            )
        }
    }
}

