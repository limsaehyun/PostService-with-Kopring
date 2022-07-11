package com.example.demo.domain.post.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PostEntity(
        title: String,
        content: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0

    @Column(length = 20)
    var title = title
        protected set

    var content = content
        protected set

    fun update(title: String, content: String) {
        this.title = title
        this.content = content
    }
}