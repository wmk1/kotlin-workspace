package com.example.demo.cqrs.repository

import com.example.demo.cqrs.dto.User

class UserRepository {

    val storeMap = hashMapOf<String, User>()

    fun addUser(user: User) {

    }

    fun getUser(userId: String): User? {
        return null
    }
}