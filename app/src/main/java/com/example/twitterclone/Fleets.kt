package com.example.twitterclone

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.twitterclone.model.Fleet
import com.example.twitterclone.ui.theme.twitterColor

@Composable
fun Fleets() {
    val fleets = remember {
        DemoData().fleetsList
    }
    LazyRow(modifier = Modifier.padding(vertical = 8.dp, horizontal = 8.dp)) {
        item {
            SelfFleetImage(image = painterResource(id = fleets[0].authorImageId))
        }
        items(fleets.subList(1, fleets.size)) {
            Spacer(modifier = Modifier.padding(start = 8.dp))
            FleetListItem(it)
        }
    }
}

@Composable
fun FleetListItem(fleet: Fleet) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(60.dp)
    ) {
        RoundImage(
            image = painterResource(id = fleet.authorImageId),
            modifier = Modifier.size(60.dp)
        )
        Text(text = fleet.author, overflow = TextOverflow.Ellipsis, maxLines = 1)
    }
}

@Composable
fun RoundImage(image: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = image,
        contentDescription = "Author Image",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .border(width = 3.dp, color = twitterColor, shape = CircleShape)
            .padding(5.dp)
            .clip(CircleShape)
    )
}

@Composable
fun SelfFleetImage(image: Painter) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(60.dp)
    ) {
        Box() {
            Image(
                painter = image, contentDescription = "Self Fleet",
                modifier = Modifier
                    .size(60.dp)
                    .aspectRatio(1f, matchHeightConstraintsFirst = true)
                    .padding(5.dp)
                    .clip(CircleShape)
            )
            Box(modifier = Modifier
                .padding(4.dp)
                .align(Alignment.BottomEnd)) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "New Fleet",
                    tint = Color.White,
                    modifier = Modifier
                        .size(15.dp)
                        .border(width = 1.dp, color = Color.Black, shape = CircleShape)
                        .clip(CircleShape)
                        .background(twitterColor)
                )
            }
        }
        Text(text = "Add", overflow = TextOverflow.Ellipsis, maxLines = 1)
    }

}

@Preview
@Composable
fun FleetsPreview() {
    Fleets()
}