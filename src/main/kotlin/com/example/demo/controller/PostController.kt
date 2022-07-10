package com.example.demo.controller

import com.example.demo.payload.response.GetPostResponse
import com.example.demo.payload.request.PostRequest
import com.example.demo.payload.response.PostResponse
import com.example.demo.service.*
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/post")
@RestController
class PostController(
        private val createPostService: CreatePostService,
        private val getPostService: GetPostService,
        private val getPostListService: GetPostListService,
        private val deletePostService: DeletePostService,
        private val patchPostService: PatchPostService
) {

    @PostMapping
    fun createPost(@RequestBody request: PostRequest): PostResponse {
        return createPostService.create(request)
    }

    @GetMapping("/{post-id}")
    fun getPost(@PathVariable(name = "post-id") id: Int): GetPostResponse {
        return getPostService.getPost(id)
    }

    @GetMapping("/list")
    fun getPosts(): List<GetPostResponse> {
        return getPostListService.getPostList()
    }

    @PatchMapping("/{post-id}")
    fun patchPost(@PathVariable(name = "post-id") id: Int, @RequestBody postRequest: PostRequest) {
        patchPostService.patchPost(id, postRequest)
    }

    @DeleteMapping("/{post-id}")
    fun deletePost(@PathVariable(name = "post-id") id: Int) {
        deletePostService.deletePost(id)
    }
}