package com.example.demo.domain.user.payload.request

import javax.validation.constraints.NotNull

data class SignInRequest(
        @field:NotNull
        val accountId: String,

        @field:NotNull
        val password: String
)
