package com.example.demo.domain.user.repository

import com.example.demo.domain.user.entity.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserEntity, Int> {
}