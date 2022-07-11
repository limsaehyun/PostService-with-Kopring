package com.example.demo.domain.post.payload.request

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class PatchPostRequest(
        @field:NotNull(message = "title must not null")
        @field:Size(min = 3, message = "제목을 3글자 이상 입력해주세요.")
        val title: String,

        @field:NotNull(message = "content must not null")
        @field:Size(min = 3, message = "내용을 3글자 이상 입력해주세요.")
        val content: String
)
