package com.example.demo.domain.user.exception.error

import com.example.demo.global.exception.error.ErrorResponse

enum class UserErrorCode(
        override val status: Int,
        override val message: String
) : ErrorResponse {

    USER_NOT_FOUND(404, "User Not Found!")
}