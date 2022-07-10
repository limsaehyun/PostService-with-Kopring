package com.example.demo.domain.post.exception.error

import com.example.demo.global.exception.error.ErrorResponse

enum class PostErrorCode(
        override val status: Int,
        override val message: String
) : ErrorResponse {

    POST_NOT_FOUND(404, "Post Not Found")
}