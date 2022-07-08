package com.example.demo.service

import com.example.demo.entity.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class DeletePostService(
        private val postRepository: PostRepository
) {

    fun deletePost(id: Int) {
        val post = postRepository.findByIdOrNull(id) ?: throw RuntimeException()
        postRepository.delete(post)
    }
}