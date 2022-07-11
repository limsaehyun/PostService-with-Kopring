package com.example.demo.domain.post.facade

import com.example.demo.domain.post.entity.PostEntity
import com.example.demo.domain.post.exception.PostNotFoundException
import com.example.demo.domain.post.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class PostFacade(
        private val postRepository: PostRepository
) {

    fun getById(id: Int): PostEntity =
            postRepository.findByIdOrNull(id) ?: throw PostNotFoundException.EXCEPTION
}