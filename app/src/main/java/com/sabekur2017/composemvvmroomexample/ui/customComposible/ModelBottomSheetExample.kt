package com.sabekur2017.composemvvmroomexample.ui.customComposible

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun ModelBottomSheetSample() {
    val state = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
    ModalBottomSheetLayout(sheetState = state, sheetContent = {
        LazyColumn {
            items(10) {
                ListItem(text = { Text(text = "Item $it") }, icon = {
                    Icon(
                        Icons.Default.Favorite,
                        contentDescription = "Localized description"
                    )
                })
            }
        }
    }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Rest of the UI")
            Spacer(Modifier.height(20.dp))
            Button(onClick = { scope.launch { state.show() } }) {
                Text(text = "Click to show Sheet")
            }

        }
    }

}