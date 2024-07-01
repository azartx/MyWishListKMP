package com.solo4.mywishlist.theme.impl.di

import com.solo4.mywishlist.theme.api.MyWishListTheme
import com.solo4.mywishlist.theme.impl.MyWishListThemeImpl
import org.koin.dsl.bind
import org.koin.dsl.module

val themeComponent = module {
    factory { MyWishListThemeImpl() } bind MyWishListTheme::class
}