package com.sabekur2017.composemvvmroomexample.ui.customComposible

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.OutlinedButton
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CircularProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    ).value
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(16.dp)) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Circular progress indicator with set undefined progress")
        CircularProgressIndicator()
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Circular Progress Indicator with progress set by buttons")
        CircularProgressIndicator(progress = animatedProgress)
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedButton(onClick = { if (progress < 1f ) progress +=0.1f }) {
            Text(text = "increase")
            
        }
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedButton(onClick = { if(progress > 0f ) progress -=0.1f }) {
            Text(text = "Decrease")
            
        }

        
    }
}
