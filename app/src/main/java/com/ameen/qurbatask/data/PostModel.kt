package com.ameen.qurbatask.data

data class PostModel(
    val itemTitle: String? = null,
    val itemPublishedDay: Int? = null,
    val itemDescription: String? = null,
    val itemType: Int? = null,
    val itemImage: Int? = null,
    val itemLikeCount: Int? = null,
    val itemCommentCount: Int? = null,
    val itemShareCount: Int? = null,
)
