package com.example.demo.service

import com.example.demo.controller.dto.PostRequest
import com.example.demo.controller.dto.PostResponse
import com.example.demo.entity.PostEntity
import com.example.demo.entity.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class CreatePostService(
        val postRepository: PostRepository
) {

    fun create(postRequest: PostRequest): PostResponse {
        postRepository.save(PostEntity(0, postRequest.title, postRequest.content))

        return PostResponse("success")
    }

}