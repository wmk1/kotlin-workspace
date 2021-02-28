package com.example.demo.repository

import com.example.demo.dto.User

class UserRepository {

    val storeMap = hashMapOf<String, User>()

    fun addUser(user: User) {

    }

    fun getUser(userId: String): User? {
        return null
    }
}