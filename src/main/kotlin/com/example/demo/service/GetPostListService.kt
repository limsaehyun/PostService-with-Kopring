package com.example.demo.service

import com.example.demo.mapper.toEntity
import com.example.demo.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class GetPostListService(
        private val postRepository: PostRepository
) {

    fun getPostList() = postRepository.findAll().map { it.toEntity() }
}