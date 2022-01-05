package com.example.twitterclone

import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.twitterclone.ui.theme.TwitterCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.makeTransparentStatusBar()
            TwitterCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TwitterHome()
                }
            }
        }
    }
}


fun Window.makeTransparentStatusBar() {
    markAttributes(
        WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                ,
        true
    )
    decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            )
    markAttributes(
        WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
               ,
        false
    )
    statusBarColor = Color.Transparent.value.toInt()
//    navigationBarColor = Color.Transparent.value.toInt()
}


fun Window.markAttributes(bits: Int, value: Boolean) {
    val params = attributes
    if (value) {
        params.flags = params.flags or bits
    } else {
        params.flags = params.flags and bits.inv()
    }
    attributes = params
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    TwitterCloneTheme {
//        TwitterHome()
//    }
//}