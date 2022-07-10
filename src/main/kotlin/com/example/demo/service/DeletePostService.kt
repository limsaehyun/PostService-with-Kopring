package com.example.demo.service

import com.example.demo.facade.PostFacade
import com.example.demo.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class DeletePostService(
        private val postRepository: PostRepository,
        private val postFacade: PostFacade
) {

    fun deletePost(id: Int) {
        val post = postFacade.getById(id)
        postRepository.delete(post)
    }
}