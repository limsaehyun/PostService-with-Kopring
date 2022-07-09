package com.example.demo.service

import com.example.demo.controller.dto.GetPostResponse
import com.example.demo.controller.dto.PostRequest
import com.example.demo.controller.mapper.toData
import com.example.demo.entity.PostEntity
import com.example.demo.entity.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PostService(
        private val postRepository: PostRepository
) {


    fun get(id: Int): GetPostResponse {
        val postEntity: PostEntity = postRepository.findByIdOrNull(id) ?: throw RuntimeException()

        return postEntity.toData()
    }

    fun getPostList(): List<GetPostResponse> {
        val posts = postRepository.findAll()

        return posts.map {
            it.toData()
        }
    }
}