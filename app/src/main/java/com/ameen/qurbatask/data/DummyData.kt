package com.ameen.qurbatask.data

import com.ameen.qurbatask.R

class DummyData {

    //Acts like a source of data.
    fun getDummyData() = listOf(
        ItemModel(
            itemTitle = "Chicken Chester",
            itemPublishedDay = 2,
            itemType = ItemType.CAFE_AND_RESTAURANT,
            itemImage = R.drawable.image,
            itemCommentCount = 50,
            itemLikeCount = 100,
            itemShareCount = 2
        ),
        ItemModel(
            itemTitle = "Burger",
            itemPublishedDay = 5,
            itemType = ItemType.RESTAURANT,
            itemImage = R.drawable.burger,
            itemCommentCount = 10,
            itemLikeCount = 30,
            itemShareCount = 2
        ),
        ItemModel(
            itemTitle = "Pablo Cafe",
            itemPublishedDay = 10,
            itemType = ItemType.CAFE,
            itemImage = R.drawable.image,
            itemCommentCount = 1,
            itemLikeCount = 5,
            itemShareCount = 4
        )
    )
}