package com.example.demo.service

import com.example.demo.payload.request.PostRequest
import com.example.demo.entity.PostEntity
import com.example.demo.facade.PostFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PatchPostService(
        private val postFacade: PostFacade
) {

    @Transactional
    fun patchPost(id: Int, postRequest: PostRequest) {
        val post: PostEntity = postFacade.getById(id)

        postRequest.run {
            post.update(title = title, content = content)
        }
    }
}