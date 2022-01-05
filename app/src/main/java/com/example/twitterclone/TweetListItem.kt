package com.example.twitterclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitterclone.model.Tweet
import com.example.twitterclone.ui.theme.twitterColor

//val tweet = DemoData().tweetList[1]

@Composable
fun TwitterItem(tweet : Tweet) {
    Row() {
        AuthorImage(imageId = tweet.authorImageId)
        Column(modifier = Modifier.padding(8.dp)) {
            NameAndHandle(
                name = tweet.author,
                handleName = tweet.handle,
                time = tweet.time,
                isVerified = true
            )
            Text(tweet.text)
            TweetImage(tweet.tweetImages)
            TweetIconSection(
                commentsCount = tweet.commentsCount,
                retweetCount = tweet.retweetCount,
                likesCount = tweet.likesCount
            )
//            Divider(thickness = 0.5.dp, color = Color.LightGray)
        }
    }
}

@Composable
fun AuthorImage(imageId: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = "Tweet Image",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .padding(top = 8.dp, start = 8.dp)
            .size(50.dp)
            .clip(CircleShape)
    )
}

@Composable
fun NameAndHandle(name: String, handleName: String, time: String, isVerified: Boolean = false) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = name,
            style = typography.h6,
            modifier = Modifier.padding(end = 4.dp)
        )
        if (isVerified) {
            Image(
                painter = painterResource(id = R.drawable.ic_verified),
                contentDescription = "Verified",
                modifier = Modifier
                    .size(18.dp)
                    .align(Alignment.CenterVertically)
                    .padding(top = 2.dp)
                    .fillMaxSize()
            )
        }

        val modifier = if (isVerified) {
            Modifier.padding(start = 8.dp)
        } else {
            Modifier.padding(start = 4.dp)
        }
        Text(
            text = handleName,
            textAlign = TextAlign.Center,
            style = typography.body1,
            modifier = modifier
        )
        Text(
            text = " . ",
            textAlign = TextAlign.Center,
            style = typography.body1,
        )
        Text(
            text = time,
            textAlign = TextAlign.Center,
            style = typography.body1
        )
    }
}

@Composable
private fun TweetImage(images: List<Int>?) {
    images?.let {
        for (image in images) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun TweetIconSection(commentsCount: Int, retweetCount: Int, likesCount: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent
            ),
            elevation = ButtonDefaults.elevation(0.dp),
            modifier = Modifier.align(Alignment.CenterVertically),
            contentPadding = PaddingValues(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp
            )
        ) {
            Row() {
                Icon(
                    painter = painterResource(id = R.drawable.ic_comment),
                    contentDescription = "Comment Icon",
                    tint = Color.LightGray,
                    modifier = Modifier
                        .size(16.dp)
                        .fillMaxSize()
                )
                Text(
                    text = commentsCount.toString(),
                    color = Color.LightGray,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
        Button(
            onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent
            ),
            elevation = ButtonDefaults.elevation(0.dp),
            modifier = Modifier.align(Alignment.CenterVertically),
            contentPadding = PaddingValues(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp
            )
        ) {
            Row() {
                Icon(
                    painter = painterResource(id = R.drawable.ic_retweet),
                    contentDescription = "Retweet Icon",
                    tint = Color.LightGray,
                    modifier = Modifier
                        .size(16.dp)
                        .fillMaxSize()
                        .fillMaxSize()

                )

                Text(
                    text = retweetCount.toString(),
                    color = Color.LightGray,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
        Button(
            onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent
            ),
            elevation = ButtonDefaults.elevation(0.dp),
            modifier = Modifier.align(Alignment.CenterVertically),
            contentPadding = PaddingValues(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp
            )
        ) {
            Row() {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favourite Icon",
                    tint = Color.LightGray,
                    modifier = Modifier
                        .size(16.dp)
                        .fillMaxSize()
                )
                Text(
                    text = "100.3k",
                    color = Color.LightGray,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 8.dp),
                )
            }
        }
        Button(
            onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent
            ),
            elevation = ButtonDefaults.elevation(0.dp),
            modifier = Modifier.align(Alignment.CenterVertically),
            contentPadding = PaddingValues(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp
            )
        ) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null,
                modifier = Modifier
                    .size(16.dp)
                    .fillMaxSize(),
                tint = Color.LightGray
            )
        }
    }
}

@Preview
@Composable
fun TwitterItemPreview() {
    TwitterItem(DemoData().tweet)
}
