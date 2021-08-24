package com.example.twitterclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TopBar() {
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
                modifier = Modifier
                    .size(28.dp)
                    .padding(end = 4.dp)
            )
        },
        backgroundColor = MaterialTheme.colors.surface,
        contentColor = MaterialTheme.colors.onSurface,
    )
}

@Composable
fun BottomBar() {
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