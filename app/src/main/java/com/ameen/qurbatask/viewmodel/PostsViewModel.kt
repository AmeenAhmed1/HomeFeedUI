package com.ameen.qurbatask.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ameen.qurbatask.data.PostModel
import com.ameen.qurbatask.repository.PostsRepository

/**
 * Acting like a real ViewModel.
 * @param postsRepository -> Repository where we collect the data from.
 */
class PostsViewModel(private val postsRepository: PostsRepository) : ViewModel() {

    val postFromJsonFile: MutableLiveData<List<PostModel>> = MutableLiveData()

    init {
        getDataFromJsonFile()
    }

    fun getDataFromJsonFile() {
        postFromJsonFile.postValue(postsRepository.getDataFromJsonFile())
    }
}