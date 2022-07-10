package com.example.demo.mapper

import com.example.demo.payload.response.GetPostResponse
import com.example.demo.payload.request.PostRequest
import com.example.demo.entity.PostEntity

fun PostEntity.toEntity(): GetPostResponse =
        GetPostResponse(
                id = id,
                title = title,
                content = content
        )

fun PostRequest.toEntity(): PostEntity =
        PostEntity(
                id = 0,
                title = title,
                content = content
        )