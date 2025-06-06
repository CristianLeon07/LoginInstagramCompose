package com.logininstagramcompose


import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(modifier: Modifier) {
    Box(
        modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Header(Modifier.align(Alignment.TopEnd))
    }


}

@SuppressLint("ContextCastToActivity")
@Composable
fun Header(modifier: Modifier) {

    val activity = LocalContext.current as Activity
    Icon(
        imageVector = Icons.Default.Close,
        contentDescription = "close app",
        modifier = modifier.clickable {
            activity.finish()

        })
}

