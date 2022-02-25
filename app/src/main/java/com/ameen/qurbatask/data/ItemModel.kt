package com.ameen.qurbatask.data

data class ItemModel(
    val itemTitle: String? = null,
    val itemPublishedDay: Int? = null,
    val itemDescription: String? = null,
    val itemType: ItemType? = null,
    val itemImage: Int? = null,
    val itemLikeCount: Int? = null,
    val itemCommentCount: Int? = null,
    val itemShareCount: Int? = null,
)
