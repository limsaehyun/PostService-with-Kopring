package com.example.demo.facade

import com.example.demo.entity.PostEntity
import com.example.demo.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class PostFacade(
        private val postRepository: PostRepository
) {

    fun getById(id: Int): PostEntity =
            postRepository.findByIdOrNull(id) ?: throw RuntimeException()
}