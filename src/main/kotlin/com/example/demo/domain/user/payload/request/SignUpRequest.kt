package com.example.demo.domain.user.payload.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class SignUpRequest(
        @field:NotNull
        @field:Size(min = 6, max = 15, message = "아이디는 6자리 이상 15자리 이하로 입력해주세요.")
        val accountId: String,

        @field:NotNull
        @field:Size(min = 6, max = 15, message = "아이디는 6자리 이상 15자리 이하로 입력해주세요.")
        val password: String,

        @field:NotNull
        @field:Size(max = 5, message = "실명을 입력해주세요.")
        val username: String,

        @field:NotNull
        @field:Email(message = "유효한 이메일을 입력해주세요.")
        val email: String
)
