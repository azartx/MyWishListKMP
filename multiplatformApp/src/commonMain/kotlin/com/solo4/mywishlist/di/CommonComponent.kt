package com.solo4.mywishlist.di

import com.solo4.mywishlist.theme.impl.di.themeComponent
import org.koin.dsl.module

val commonComponent = module {
    includes(themeComponent)
}