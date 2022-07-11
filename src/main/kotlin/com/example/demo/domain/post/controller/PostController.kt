package com.example.demo.domain.post.controller

import com.example.demo.domain.post.payload.request.PatchPostRequest
import com.example.demo.domain.post.payload.response.GetPostResponse
import com.example.demo.domain.post.payload.request.SavePostRequest
import com.example.demo.domain.post.payload.response.DeletePostResponse
import com.example.demo.domain.post.payload.response.SavePostResponse
import com.example.demo.domain.post.service.*
import com.example.demo.global.payload.BaseResponse
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/post")
@RestController
class PostController(
        private val savePostService: SavePostService,
        private val getPostService: GetPostService,
        private val getPostListService: GetPostListService,
        private val deletePostService: DeletePostService,
        private val patchPostService: PatchPostService
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun savePost(@RequestBody @Validated request: SavePostRequest): BaseResponse<SavePostResponse> {
        return savePostService.savePost(request)
    }

    @GetMapping("/{post-id}")
    fun getPost(@PathVariable("post-id") id: Int): BaseResponse<GetPostResponse> {
        return getPostService.getPost(id)
    }

    @GetMapping("/list")
    fun getPostList(): BaseResponse<List<GetPostResponse>> {
        return getPostListService.getPostList()
    }

    @PatchMapping("/{post-id}")
    fun patchPost(@PathVariable("post-id") id: Int, @RequestBody @Validated patchPostRequest: PatchPostRequest): BaseResponse<Unit> {
        return patchPostService.patchPost(id, patchPostRequest)
    }

    @DeleteMapping("/{post-id}")
    fun deletePost(@PathVariable("post-id") id: Int): BaseResponse<DeletePostResponse> {
        return deletePostService.deletePost(id)
    }
}