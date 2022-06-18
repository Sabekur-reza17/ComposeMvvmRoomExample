package com.sabekur2017.composemvvmroomexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sabekur2017.composemvvmroomexample.ui.customComposible.CustomCard
import com.sabekur2017.composemvvmroomexample.ui.theme.ComposeMvvmRoomExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMvvmRoomExampleTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        CustomCard(name = "Reza custom", color = MaterialTheme.colors.primary)

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMvvmRoomExampleTheme {
        CustomCard(name = "Reza preview", color = MaterialTheme.colors.primary)
    }
}