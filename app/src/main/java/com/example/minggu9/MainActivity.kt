package com.example.minggu9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.minggu9.ui.navigation.PengelolaHalaman
import com.example.minggu9.ui.theme.Minggu9Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Minggu9Theme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    PengelolaHalaman(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}
