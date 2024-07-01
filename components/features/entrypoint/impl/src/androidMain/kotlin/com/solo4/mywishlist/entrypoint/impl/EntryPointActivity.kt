package com.solo4.mywishlist.entrypoint.impl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class EntryPointActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EntryPointApp()
        }
    }
}