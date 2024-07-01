package com.solo4.mywishlist.di

import com.solo4.mywishlist.theme.impl.di.themeComponent
import org.koin.core.module.Module
import org.koin.dsl.module

val appComponent = module {
    includes(platformAppComponent)

    includes(commonComponent)
    includes(featuresComponent)
}

expect val platformAppComponent: Module