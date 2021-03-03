package com.example.demo.cqrs.repository

import com.example.demo.cqrs.dto.UserAddress
import com.example.demo.cqrs.dto.UserContact

class UserReadRepository {

    private val userAddress: MutableMap<String, UserAddress> = HashMap()

    private val userContact: MutableMap<String, UserContact> = HashMap()

    fun addUserAddress(id: String, user: UserAddress) {
        userAddress[id] = user
    }

    fun getUserAddress(id: String): UserAddress? {
        return userAddress[id]
    }

    fun addUserContact(id: String, user: UserContact) {
        userContact[id] = user
    }

    fun getUserContact(id: String): UserContact? {
        return userContact[id]
    }

}