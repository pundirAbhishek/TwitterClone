package com.example.twitterclone

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.twitterclone.ui.theme.TwitterCloneTheme
import com.example.twitterclone.ui.theme.twitterColor

@Composable
fun TwitterHome() {
    Scaffold(
        topBar = {
            Column() {
                TopBar()
                Fleets()
                Divider(thickness = 0.5.dp, color = Color.LightGray)
            }
        },
        floatingActionButton = {
            Fab()
        },
        bottomBar = {
            BottomBar()
        }
    )
    { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
           items(DemoData().tweetList){ tweet ->
               TwitterItem(tweet)
               Divider(thickness = 0.5.dp, color = Color.LightGray)
           }
        }
    }
}

@Preview
@Composable
fun Preview() {
    TwitterCloneTheme(darkTheme = true) {
        TwitterHome()
    }
}

@Composable
fun BottomBarIcon(@DrawableRes icon: Int) {
    IconButton(onClick = {}) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "Home Selected Icon",
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun Fab() {
    FloatingActionButton(
        onClick = { },
        backgroundColor = twitterColor
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Fab Icon",
            tint = Color.White,
            modifier = Modifier.size(30.dp)
        )
    }
}
