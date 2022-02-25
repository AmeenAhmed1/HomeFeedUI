package com.ameen.qurbatask.util

import com.ameen.qurbatask.data.ItemType

object Utils {

    fun getType(item: ItemType) = when (item) {
        ItemType.CAFE_AND_RESTAURANT -> "Cafe & Restaurant"
        ItemType.USER -> "User"
        ItemType.CAFE -> "Cafe"
        ItemType.RESTAURANT -> "Restaurant"
        else -> " "
    }

}