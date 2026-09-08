package com.example.tugas_pam_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello()
        }
    }
}

@Preview
@Composable
fun Hello() {
    Row (
        Modifier.padding(vertical = 50.dp)
    ){
        Column {
            Image(
                painter = painterResource(id = R.drawable.quack),
                contentDescription = "Profile picture",
                Modifier.size(100.dp)
            )
        }
        Column(
            Modifier.padding(vertical = 30.dp)
        ) {
            Text(
                text = "NIM : 245150400111016",
                Modifier.padding(all = 10.dp)
            )
            Text(
                text = "Nama: Mifzal Arif Maulana",
                Modifier.padding(all = 10.dp)
            )
        }
    }
}