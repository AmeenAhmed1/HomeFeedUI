package com.ameen.qurbatask.data

import android.content.Context
import com.ameen.qurbatask.R
import com.ameen.qurbatask.util.Utils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class DummyData {

    fun loadDataFromJson(context: Context): List<PostModel> {

        val jsonString = Utils.getPostDataFromJsonFile(context, "posts_data.json")
        val gson = Gson()
        val list = object : TypeToken<List<PostModel>>() {}.type

        return gson.fromJson(jsonString, list)
    }

    //Acts like a source of data.
    fun getDummyData() = listOf(
        PostModel(
            itemTitle = "Chicken Chester",
            itemPublishedDay = 2,
            itemType = 2,
            itemImage = R.drawable.image,
            itemCommentCount = 50,
            itemLikeCount = 100,
            itemShareCount = 2
        ),
        PostModel(
            itemTitle = "Burger",
            itemPublishedDay = 5,
            itemType = 0,
            itemImage = R.drawable.burger,
            itemCommentCount = 10,
            itemLikeCount = 30,
            itemShareCount = 2
        ),
        PostModel(
            itemTitle = "Pablo Cafe",
            itemPublishedDay = 10,
            itemType = 1,
            itemImage = R.drawable.image,
            itemCommentCount = 1,
            itemLikeCount = 5,
            itemShareCount = 4
        )
    )
}