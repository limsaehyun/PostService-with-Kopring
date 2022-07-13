package com.example.demo.domain.user.entity

import org.intellij.lang.annotations.Identifier
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class UserEntity(
        accountId: String,
        password: String,
        username: String,
        email: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id = 0

    @Column(length = 15)
    var accountId = accountId
        protected set

    @Column(length = 15)
    var password = password
        protected set

    @Column(length = 5)
    var username = username
        protected set

    var email = email
        protected set
}