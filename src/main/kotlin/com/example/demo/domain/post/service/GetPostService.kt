package com.example.demo.domain.post.service

import com.example.demo.domain.post.facade.PostFacade
import com.example.demo.domain.post.payload.response.GetPostResponse
import com.example.demo.domain.post.mapper.toEntity
import com.example.demo.domain.post.repository.PostRepository
import com.example.demo.domain.post.utils.Message
import com.example.demo.global.payload.BaseResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class GetPostService(
        private val postFacade: PostFacade
) {

    fun getPost(id: Int): BaseResponse<GetPostResponse> {
        val postEntity = postFacade.getById(id).toEntity()

        return BaseResponse(
                status = 200,
                message = Message.GET_POST_SUCCESS_MESSAGE,
                content = postEntity
        )
    }
}