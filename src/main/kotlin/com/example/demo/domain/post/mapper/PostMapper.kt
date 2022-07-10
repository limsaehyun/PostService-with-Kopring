package com.example.demo.domain.post.mapper

import com.example.demo.domain.post.payload.response.GetPostResponse
import com.example.demo.domain.post.payload.request.SavePostRequest
import com.example.demo.domain.post.entity.PostEntity

fun PostEntity.toEntity(): GetPostResponse =
        GetPostResponse(
                id = id,
                title = title,
                content = content
        )

fun SavePostRequest.toEntity(): PostEntity =
        PostEntity(
                id = 0,
                title = title,
                content = content
        )