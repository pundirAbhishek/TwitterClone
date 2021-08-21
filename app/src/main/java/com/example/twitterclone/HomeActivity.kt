package com.example.twitterclone

import android.content.res.Resources
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                TopAppBar(
                    title = {
                        Image(
                            painter = painterResource(id = R.drawable.ic_twitter),
                            contentDescription = "Twitter Trends",
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(24.dp)

                        )
                    },
                    navigationIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.p3),
                            contentDescription = "User Image",
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .size(28.dp)
                                .clip(CircleShape)
                        )
                    },
                    actions = {
                        Image(
                            painter = painterResource(id = R.drawable.ic_trends),
                            contentDescription = "Twitter Trends",
                            modifier = Modifier.size(28.dp).padding(end = 4.dp)
                        )
                    },
                    backgroundColor = MaterialTheme.colors.surface,
                    contentColor = MaterialTheme.colors.onSurface,
                )
                Fleets()
                Divider(thickness = 0.5.dp, color = Color.LightGray)
            }
        },
        floatingActionButton = {
            Fab()
        },
        bottomBar = {
            BottomAppBar(backgroundColor = MaterialTheme.colors.surface) {
                Column {
                    Divider(thickness = 0.5.dp, color = Color.LightGray)
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                    ) {
                        BottomBarIcon(R.drawable.ic_home_selected)
                        BottomBarIcon(R.drawable.ic_search)
                        BottomBarIcon(R.drawable.ic_notifications)
                        BottomBarIcon(R.drawable.ic_dm)
                    }
                }
            }
        }
    )
    { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            item {
                TwitterItem()
                Divider(thickness = 0.5.dp, color = Color.LightGray)
            }
            item {
                TwitterItem()
                Divider(thickness = 0.5.dp, color = Color.LightGray)
            }
            item {
                TwitterItem()
                Divider(thickness = 0.5.dp, color = Color.LightGray)
            }
            item {
                TwitterItem()
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
