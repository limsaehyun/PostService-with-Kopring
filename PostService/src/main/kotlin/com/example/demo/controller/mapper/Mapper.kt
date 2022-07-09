package com.example.demo.controller.mapper

import com.example.demo.controller.dto.GetPostResponse
import com.example.demo.controller.dto.PostRequest
import com.example.demo.entity.PostEntity

fun PostEntity.toData(): GetPostResponse =
        GetPostResponse(
                id = id,
                title = title,
                content = content
        )

fun PostRequest.toData(): PostEntity =
        PostEntity(
                id = 0,
                title = title,
                content = content
        )