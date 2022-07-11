package com.example.demo.domain.post.service

import com.example.demo.domain.post.entity.PostEntity
import com.example.demo.domain.post.payload.response.GetPostResponse
import com.example.demo.domain.post.repository.PostRepository
import com.example.demo.domain.post.utils.Message.GET_POST_LIST_SUCCESS_MESSAGE
import com.example.demo.global.payload.BaseResponse
import org.springframework.stereotype.Service

@Service
class GetPostListService(
        private val postRepository: PostRepository
) {

    fun getPostList(): BaseResponse<List<GetPostResponse>> {
        val postListEntity = postRepository.findAll().map { it.toEntity() }

        return BaseResponse(
                status = 200,
                message = GET_POST_LIST_SUCCESS_MESSAGE,
                content = postListEntity
        )
    }

    private fun PostEntity.toEntity(): GetPostResponse =
            GetPostResponse(
                    id = id,
                    title = title,
                    content = content
            )
}