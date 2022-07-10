package com.example.demo.domain.post.exception

import com.example.demo.domain.post.exception.error.PostErrorCode
import com.example.demo.global.exception.GlobalException

class PostNotFoundException private constructor() : GlobalException(error = PostErrorCode.POST_NOT_FOUND) {
    companion object {
        @JvmField
        val EXCEPTION = PostNotFoundException()
    }
}