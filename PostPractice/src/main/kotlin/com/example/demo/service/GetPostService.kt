package com.example.demo.service

import com.example.demo.controller.dto.GetPostResponse
import com.example.demo.entity.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class GetPostService(
        private val postRepository: PostRepository
) {

    fun getPost(id: Int): GetPostResponse {
        val post = postRepository.findByIdOrNull(id) ?: throw RuntimeException()

        post.run {
            return GetPostResponse(id, title, content)
        }
    }
}