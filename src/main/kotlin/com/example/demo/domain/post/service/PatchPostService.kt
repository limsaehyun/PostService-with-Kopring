package com.example.demo.domain.post.service

import com.example.demo.domain.post.entity.PostEntity
import com.example.demo.domain.post.facade.PostFacade
import com.example.demo.domain.post.payload.request.PatchPostRequest
import com.example.demo.domain.post.utils.Message.UPDATE_POST_SUCCESS_MESSAGE
import com.example.demo.global.payload.BaseResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PatchPostService(
        private val postFacade: PostFacade
) {

    @Transactional
    fun patchPost(id: Int, request: PatchPostRequest): BaseResponse<Unit> {
        val post: PostEntity = postFacade.getById(id)

        request.run {
            post.update(title = title, content = content)
        }

        return BaseResponse(
                status = 200,
                message = UPDATE_POST_SUCCESS_MESSAGE,
                content = Unit
        )
    }
}