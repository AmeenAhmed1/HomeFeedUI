package com.ameen.qurbatask.repository

import android.content.Context
import com.ameen.qurbatask.data.DummyData
import com.ameen.qurbatask.data.PostModel

/**
 * Acting like a real repository and get Data from Json File.
 * @param context -> Application Context to Open File Asset.
 */

class PostsRepository(private val context: Context) {

    /**
     * Acting like a real repository function to get Data from Json File.
     * @return List<PostModel> -> A List which we read from the File.
     */
    fun getDataFromJsonFile() : List<PostModel> =
        DummyData().loadDataFromJson(context)
}