package com.example.demo.domain.user.controller

import com.example.demo.domain.user.payload.request.SignUpRequest
import com.example.demo.domain.user.service.SignUpService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RequestMapping("/user")
@RestController
class UserController(
        private val signUpService: SignUpService
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun save(@RequestBody @Valid request: SignUpRequest) {
        signUpService.save(request)
    }
}