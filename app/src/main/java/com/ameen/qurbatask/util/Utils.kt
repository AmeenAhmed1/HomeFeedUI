package com.ameen.qurbatask.util

import android.content.Context
import com.ameen.qurbatask.data.PlaceType

object Utils {

    fun getPlaceType(place: Int) = when (place) {
        0 -> getType(PlaceType.RESTAURANT)
        1 -> getType(PlaceType.CAFE)
        2 -> getType(PlaceType.CAFE_AND_RESTAURANT)
        3 -> getType(PlaceType.USER)
        else -> null
    }

    private fun getType(place: PlaceType) = when (place) {
        PlaceType.CAFE_AND_RESTAURANT -> "Cafe & Restaurant"
        PlaceType.USER -> "User"
        PlaceType.CAFE -> "Cafe"
        PlaceType.RESTAURANT -> "Restaurant"
        else -> " "
    }

    fun getPostDataFromJsonFile(context: Context, fileName: String) =
        context.assets.open(fileName).bufferedReader().use {
            it.readText()
        }

}