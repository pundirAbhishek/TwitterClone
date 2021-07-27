package com.example.twitterclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
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
            TopAppBar(
                title = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_twitter),
                        contentDescription = "Twitter logo",
                        tint = twitterColor,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                navigationIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.p3),
                        contentDescription = "User Image",
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                            .size(32.dp)
                            .clip(CircleShape)
                    )
                },
                actions = {
                    Icon(
                        imageVector = Icons.Default.StarBorder,
                        contentDescription = "Bookmark Icon",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                backgroundColor = MaterialTheme.colors.surface,
                contentColor = MaterialTheme.colors.onSurface,
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                backgroundColor = twitterColor
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "New Tweet"
                )
            }
        },
        bottomBar = {
            Column() {
                Divider(color = Color.Gray, thickness = 0.5.dp)
                TabRow(selectedTabIndex = 0, backgroundColor = MaterialTheme.colors.surface) {
                    Tab(
                        selected = true,
                        onClick = { },
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = null)
                    }
                    Tab(
                        selected = true,
                        onClick = { },
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = null)
                    }
                    Tab(
                        selected = true,
                        onClick = { },
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Icon(imageVector = Icons.Default.Notifications, contentDescription = null)
                    }
                    Tab(
                        selected = true,
                        onClick = { },
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Icon(imageVector = Icons.Default.Email, contentDescription = null)
                    }

                }
            }
        }
    )
    {
        Column() {
            TwitterItem()
            TwitterItem()
            TwitterItem()
            TwitterItem()
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

