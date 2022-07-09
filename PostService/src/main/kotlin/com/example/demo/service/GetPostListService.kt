package com.example.demo.service

import com.example.demo.controller.dto.GetPostResponse
import com.example.demo.controller.mapper.toData
import com.example.demo.entity.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class GetPostListService(
        private val postRepository: PostRepository
) {

    fun getPostList() = postRepository.findAll().map { it.toData() }
}