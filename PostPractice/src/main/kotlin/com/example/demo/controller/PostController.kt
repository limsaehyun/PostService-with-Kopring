package com.example.demo.controller

import com.example.demo.controller.dto.GetPostResponse
import com.example.demo.controller.dto.PostRequest
import com.example.demo.controller.dto.PostResponse
import com.example.demo.service.*
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController(
        private val createPostService: CreatePostService,
        private val getPostService: GetPostService,
        private val getPostListService: GetPostListService,
        private val deletePostService: DeletePostService
) {

    @PostMapping("/post")
    fun createPost(@RequestBody request: PostRequest): PostResponse {
        return createPostService.create(request)
    }

    @GetMapping("/post/{post-id}")
    fun getPost(@PathVariable(name = "post-id") id: Int): GetPostResponse {
        return getPostService.getPost(id)
    }

    @GetMapping("/posts")
    fun getPosts(): List<GetPostResponse> {
        return getPostListService.getPostList()
    }

    @DeleteMapping("/post/{post-id}")
    fun deletePost(@PathVariable(name = "post-id") id: Int) {
        deletePostService.deletePost(id)
    }
}