package com.example.twitterclone

import com.example.twitterclone.model.Fleet
import com.example.twitterclone.model.Tweet

class DemoData {
    val tweet = Tweet(
        1,
        "Jetpack compose is the next thing for andorid. Declarative UI is the way to go for all screens.",
        "The Verge",
        "@verge",
        "12m",
        R.drawable.food1,
        100,
        12,
        15,
        "Twitter for web"
    )

    val fleet = Fleet(
        1,
        "The Verge",
        R.drawable.self,
    )

    val tweetList = listOf(
        tweet,
        tweet.copy(
            id = 2,
            author = "Google",
            handle = "@google",
            authorImageId = R.drawable.google,
            tweetImages = listOf(R.drawable.compose),
            time = "11m"
        ),
        tweet.copy(
            id = 3,
            author = "Amazon",
            handle = "@Amazon",
            text = "Amazon.com, Inc. is an American multinational conglomerate which focuses on e-commerce, cloud computing, digital streaming, and artificial intelligence.",
            authorImageId = R.drawable.amazon,
            time = "1h"
        ),
        tweet.copy(
            id = 4,
            author = "Facebook",
            handle = "@Facebook",
            authorImageId = R.drawable.fb,
            time = "1h"
        ),
        tweet.copy(
            id = 5,
            author = "Instagram",
            handle = "@Instagram",
            authorImageId = R.drawable.instagram,
            tweetImages = listOf(R.drawable.food15),
            time = "11m"
        ),
        tweet.copy(
            id = 6,
            author = "Twitter",
            handle = "@Twitter",
            authorImageId = R.drawable.p5,
            tweetImages = listOf(R.drawable.food3),
            time = "11m"
        ),
        tweet.copy(
            id = 7,
            author = "Netflix",
            handle = "@Netflix",
            authorImageId = R.drawable.p6,
            tweetImages = listOf(R.drawable.food4),
            time = "11m"
        ),
        tweet.copy(
            id = 8,
            author = "Tesla",
            handle = "@Tesla",
            authorImageId = R.drawable.p7,
            time = "1h"
        ),
        tweet.copy(
            id = 9,
            author = "Microsoft",
            handle = "@Microsoft",
            authorImageId = R.drawable.p8,
            time = "1h"
        ),
        tweet.copy(
            id = 3,
            author = "Tencent",
            handle = "@Tencent",
            authorImageId = R.drawable.p9,
            time = "1h"
        ),
        tweet.copy(
            id = 4,
            author = "Snapchat",
            handle = "@Snapchat",
            authorImageId = R.drawable.p10,
            time = "1h"
        ),
        tweet.copy(
            id = 5,
            author = "Snapchat",
            handle = "@Snapchat",
            authorImageId = R.drawable.p11,
            tweetImages = listOf(R.drawable.food5),
            time = "11m"
        ),
        tweet.copy(
            id = 6,
            author = "Tiktok",
            handle = "@Tiktok",
            authorImageId = R.drawable.p1,
            tweetImages = listOf(R.drawable.food6),
            time = "11m"
        ),
        tweet.copy(
            id = 7,
            author = "Samsung",
            handle = "@Samsung",
            authorImageId = R.drawable.p2,
            tweetImages = listOf(R.drawable.food7),
            time = "11m"
        ),
        tweet.copy(
            id = 8,
            author = "Youtube",
            handle = "@Youtube",
            authorImageId = R.drawable.p3,
            time = "1h"
        ),
        tweet.copy(
            id = 9,
            author = "Gmail",
            handle = "@Gmail",
            authorImageId = R.drawable.p4,
            time = "1h"
        ),
        tweet.copy(
            id = 3,
            author = "Android",
            handle = "@Android",
            authorImageId = R.drawable.p5,
            time = "1h"
        ),
        tweet.copy(
            id = 4,
            author = "Whatsapp",
            handle = "@Whatsapp",
            authorImageId = R.drawable.p6,
            time = "1h"
        ),
        tweet.copy(
            id = 5,
            author = "Telegram",
            handle = "@Telegram",
            authorImageId = R.drawable.p7,
            tweetImages = listOf(R.drawable.food8),
            time = "11m"
        ),
        tweet.copy(
            id = 6,
            author = "Spotify",
            handle = "@Spotify",
            authorImageId = R.drawable.p8,
            tweetImages = listOf(R.drawable.food9),
            time = "11m"
        ),
        tweet.copy(
            id = 7,
            author = "WeChat",
            handle = "@WeChat",
            authorImageId = R.drawable.p9,
            tweetImages = listOf(R.drawable.food10),
            time = "11m"
        ),
        tweet.copy(
            id = 8,
            author = "Airbnb",
            handle = "@Airbnb",
            authorImageId = R.drawable.p10,
            time = "1h"
        ),
        tweet.copy(
            id = 9,
            author = "LinkedIn",
            handle = "@LinkedIn",
            authorImageId = R.drawable.p11,
            time = "1h"
        ),
        tweet.copy(
            id = 6,
            author = "Shazam",
            handle = "@Shazam",
            authorImageId = R.drawable.p8,
            tweetImages = listOf(R.drawable.food11),
            time = "11m"
        ),
        tweet.copy(
            id = 7,
            author = "Chrome",
            handle = "@Chrome",
            authorImageId = R.drawable.p9,
            tweetImages = listOf(R.drawable.food12),
            time = "11m"
        ),
        tweet.copy(
            id = 6,
            author = "Safari",
            handle = "@Safari",
            authorImageId = R.drawable.p8,
            tweetImages = listOf(R.drawable.food13),
            time = "11m"
        ),
        tweet.copy(
            id = 7,
            author = "Disney",
            handle = "@Disney",
            authorImageId = R.drawable.p9,
            tweetImages = listOf(R.drawable.food14),
            time = "11m"
        )


    )


    val fleetsList = listOf(
        fleet,
        fleet.copy(
            id = 2,
            author = "Google",
            authorImageId = R.drawable.google,
        ),
        fleet.copy(
            id = 3,
            author = "Amazon",
            authorImageId = R.drawable.amazon,
        ),
        fleet.copy(
            id = 4,
            author = "Facebook",
            authorImageId = R.drawable.fb,
        ),
        fleet.copy(
            id = 5,
            author = "Instagram",
            authorImageId = R.drawable.instagram,
        ),
        fleet.copy(
            id = 6,
            author = "Twitter",
            authorImageId = R.drawable.twitter,
        ),
        fleet.copy(
            id = 7,
            author = "Netflix",
            authorImageId = R.drawable.p6,
        ),
        fleet.copy(
            id = 8,
            author = "Tesla",
            authorImageId = R.drawable.p7,
        ),
        fleet.copy(
            id = 9,
            author = "Microsoft",
            authorImageId = R.drawable.p8,
        ),
        fleet.copy(
            id = 3,
            author = "Tencent",
            authorImageId = R.drawable.p9,
        ),
        fleet.copy(
            id = 4,
            author = "Snapchat",
            authorImageId = R.drawable.p10,
        ),
        fleet.copy(
            id = 5,
            author = "Snapchat",
            authorImageId = R.drawable.p11,
        ),
        fleet.copy(
            id = 6,
            author = "Tiktok",
            authorImageId = R.drawable.p1,
        ),
        fleet.copy(
            id = 7,
            author = "Samsung",
            authorImageId = R.drawable.p2,
        ),
        fleet.copy(
            id = 8,
            author = "Youtube",
            authorImageId = R.drawable.p3,
        ),
        fleet.copy(
            id = 9,
            author = "Gmail",
            authorImageId = R.drawable.p4,
        )
    )
}