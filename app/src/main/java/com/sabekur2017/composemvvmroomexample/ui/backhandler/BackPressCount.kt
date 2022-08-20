package com.sabekur2017.composemvvmroomexample.ui.backhandler

import androidx.activity.compose.BackHandler
import androidx.compose.material.Text
import androidx.compose.runtime.*


@Composable
fun BackHandlerExample() {
    var backPressedCount by remember { mutableStateOf(0) }
    BackHandler(enabled = true, onBack = {
        backPressedCount += 1
    })
    Text(text = "Backpressed was pressed : $backPressedCount times" )
}
