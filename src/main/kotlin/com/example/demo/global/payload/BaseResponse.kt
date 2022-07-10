package com.example.demo.global.payload

import com.example.demo.global.exception.GlobalException
import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonInclude

class BaseResponse<T>(
        val status: Int,
        val message: String,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        val content: T?
) {
    companion object {
        fun of(e: GlobalException): BaseResponse<Unit> {
            return BaseResponse(
                    status = e.status,
                    message = e.message,
                    content = null
            )
        }
    }
}