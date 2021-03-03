package com.example.demo.cqrs.repository

import com.example.demo.cqrs.dto.User

class UserWriteRepository {

    private val store: MutableMap<String, User> = HashMap()

    fun addUser(id: String, user: User) {
        store[id] = user
    }

    fun getUser(id: String): User? {
        return store[id]
    }
}
