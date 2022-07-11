package com.example.demo.global.exception.error

import com.example.demo.global.exception.GlobalException

object InvalidMethodArgumentException: GlobalException(GlobalExceptionErrorCode.INVALID_METHOD_ARGUMENT) {
    val EXCEPTION = InvalidMethodArgumentException
}