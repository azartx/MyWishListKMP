package com.solo4.mywishlist.theme.api

import androidx.compose.runtime.Composable

interface MyWishListTheme {

    @Composable
    fun setContent(content: @Composable () -> Unit)
}