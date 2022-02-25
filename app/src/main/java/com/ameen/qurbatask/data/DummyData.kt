package com.ameen.qurbatask.data

class DummyData {

    //Acts like a source of data.
    fun getDummyData() = listOf(
        ItemModel(
            itemTitle = "Chicken Chester",
            itemPublishedDay = 2,
            itemType = ItemType.CAFE_AND_RESTAURANT
        ),
        ItemModel(
            itemTitle = "Burger",
            itemPublishedDay = 5,
            itemType = ItemType.RESTAURANT
        ),
        ItemModel(
            itemTitle = "Pablo Cafe",
            itemPublishedDay = 10,
            itemType = ItemType.CAFE
        ),
        ItemModel(
            itemTitle = "Chicken Chester",
            itemPublishedDay = 1,
            itemType = ItemType.CAFE_AND_RESTAURANT
        )
    )
}