package com.example.demo.domain.post.repository

import com.example.demo.domain.post.entity.PostEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository: CrudRepository<PostEntity, Int> {
}