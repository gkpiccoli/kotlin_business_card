package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun PersonalData(name: String, title: String) {
    Column {
        Text(text = "$name $title", fontSize = 32.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(all = 20.dp))




        Text(text = title, fontSize = 24.sp, modifier = Modifier
        .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(start = 30.dp, top = 20.dp, end = 1.dp))
    }
}


@Composable
fun AndroidLogo() {
    val image = painterResource(id = R.drawable.android_logo)
    Box {
        Image(painter = image, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop)

    }

}
@Preview(showBackground = true,
    name = "My preview",
    backgroundColor = 0x94481a83,
    device = Devices.NEXUS_6P
)

@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        PersonalData("Gustavo K. Piccoli", title = "Android Developer Extraordinaire")
    }
}