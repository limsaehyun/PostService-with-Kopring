package com.example.demo.service

import com.example.demo.facade.PostFacade
import com.example.demo.payload.response.GetPostResponse
import com.example.demo.mapper.toEntity
import com.example.demo.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class GetPostService(
        private val postFacade: PostFacade
) {

    fun getPost(id: Int): GetPostResponse =
            postFacade.getById(id).toEntity()
}