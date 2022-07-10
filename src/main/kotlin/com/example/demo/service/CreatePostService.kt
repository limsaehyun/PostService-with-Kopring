package com.example.demo.service

import com.example.demo.payload.request.PostRequest
import com.example.demo.payload.response.PostResponse
import com.example.demo.entity.PostEntity
import com.example.demo.mapper.toEntity
import com.example.demo.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class CreatePostService(
        val postRepository: PostRepository
) {

    fun create(postRequest: PostRequest): PostResponse {
        postRepository.save(postRequest.toEntity())

        return PostResponse("success")
    }
}