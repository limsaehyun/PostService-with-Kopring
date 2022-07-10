package com.example.demo.domain.post.service

import com.example.demo.domain.post.facade.PostFacade
import com.example.demo.domain.post.payload.response.DeletePostResponse
import com.example.demo.domain.post.repository.PostRepository
import com.example.demo.domain.post.utils.Message.DELETE_POST_SUCCESS_MESSAGE
import com.example.demo.global.payload.BaseResponse
import org.hibernate.sql.Delete
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class DeletePostService(
        private val postRepository: PostRepository,
        private val postFacade: PostFacade
) {

    fun deletePost(id: Int): BaseResponse<DeletePostResponse> {
        val post = postFacade.getById(id)
        postRepository.delete(post)

        val deletePostResponse = DeletePostResponse(id)

        return BaseResponse(
                status = 200,
                message = DELETE_POST_SUCCESS_MESSAGE,
                content = deletePostResponse
        )
    }
}