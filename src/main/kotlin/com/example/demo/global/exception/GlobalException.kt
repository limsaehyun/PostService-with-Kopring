package com.example.demo.global.exception

import com.example.demo.global.exception.error.ErrorResponse

open class GlobalException(private val error: ErrorResponse): RuntimeException() {
    val status: Int
    get() = error.status

    override val message: String
    get() = error.message
}