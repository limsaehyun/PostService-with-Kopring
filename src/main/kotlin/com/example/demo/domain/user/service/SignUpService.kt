package com.example.demo.domain.user.service

import com.example.demo.domain.user.repository.UserRepository
import com.example.demo.domain.user.entity.UserEntity
import com.example.demo.domain.user.payload.request.SignUpRequest
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class SignUpService(
        private val userRepository: UserRepository,
        private val passwordEncoder: PasswordEncoder
) {

    fun save(signUpRequest: SignUpRequest) {
        userRepository.save(signUpRequest.toEntity())
    }

    private fun SignUpRequest.toEntity() = UserEntity(
            accountId = accountId,
            password = passwordEncoder.encode(password),
            email = email,
            username = username
    )
}