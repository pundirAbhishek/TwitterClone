package com.example.twitterclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
            Column() {
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
                Fleets()
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                backgroundColor = twitterColor
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "New Tweet"
                )
            }
        },
        bottomBar = {
            BottomAppBar(
                content = {
                    BottomNavigation() {
                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Filled.Home , "Home")
                            },
                            selected = true,
                            onClick = {},
                            alwaysShowLabel = false
                        )

                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Filled.Search , "Search")
                            },
                            selected = false,
                            onClick = {},
                            alwaysShowLabel = false
                        )

                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Filled.Notifications ,  "Notification")
                            },
                            selected = false,
                            onClick = {},
                            alwaysShowLabel = false
                        )

                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Filled.Email , "Messages")
                            },
                            selected = false,
                            onClick = {},
                            alwaysShowLabel = false
                        )
                    }
                }
            )
        }
    )
    { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            item {
                TwitterItem()
            }
            item {
                TwitterItem()
            }
            item {
                TwitterItem()
            }
            item {
                TwitterItem()
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

