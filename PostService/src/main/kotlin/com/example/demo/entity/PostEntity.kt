package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PostEntity(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,

        var title: String,

        var content: String
) {
        fun update(title: String, content: String) {
                this.title = title
                this.content = content
        }
}