package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PersonalData("Android", title = "Android Developer")
                }
            }
        }
    }
}
@Composable
fun CardWithAndroidLogo() {
    val image = painterResource(id = R.drawable.android_logo)
    Box {
        Image(painter = image, contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentScale = ContentScale.Crop)

    }
}


@Composable
fun PersonalData(name: String, title: String) {
    Text(text = "Hello $name! You are $title")
}

@Preview(showBackground = true,
    name = "My preview",
    backgroundColor = 0x94481a83,
    device = Devices.NEXUS_6P
)

@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        PersonalData("Android", title = "A Good Guy")
    }
}