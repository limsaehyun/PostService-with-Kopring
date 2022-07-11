package com.example.demo.domain.post.service

import com.example.demo.domain.post.entity.PostEntity
import com.example.demo.domain.post.payload.request.SavePostRequest
import com.example.demo.domain.post.payload.response.SavePostResponse
import com.example.demo.domain.post.repository.PostRepository
import com.example.demo.domain.post.utils.Message
import com.example.demo.global.payload.BaseResponse
import org.springframework.stereotype.Service

@Service
class SavePostService(
        val postRepository: PostRepository
) {

    fun savePost(postRequest: SavePostRequest): BaseResponse<SavePostResponse> {

        val savedPost = postRepository.save(postRequest.toEntity())

        val responseContent = SavePostResponse(savedPost.id)

        return BaseResponse(
                200,
                Message.SAVE_POST_SUCCESS_MESSAGE,
                responseContent
        )
    }

    private fun SavePostRequest.toEntity(): PostEntity =
            PostEntity(
                    title = title,
                    content = content
            )
}