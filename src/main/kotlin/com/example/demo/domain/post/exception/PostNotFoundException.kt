package com.example.demo.domain.post.exception

import com.example.demo.domain.post.exception.error.PostErrorCode
import com.example.demo.global.exception.GlobalException

object PostNotFoundException : GlobalException(PostErrorCode.POST_NOT_FOUND) {
    val EXCEPTION = PostNotFoundException
}