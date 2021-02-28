package com.example.demo.service

import com.example.demo.dto.Address
import com.example.demo.dto.User
import com.example.demo.repository.UserRepository
import java.util.stream.Collectors

import com.example.demo.dto.Contact
import java.util.function.Predicate


class UserService {

    val userRepository: UserRepository

    constructor(userRepository: UserRepository) {
        this.userRepository = userRepository
    }

    fun createUser(userId: String, firstName: String, lastName: String) {
        val user = User(userId, firstName, lastName)
        userRepository.addUser(user)
    }

    fun updateUser(userId: String, addresses: Set<String>, contacts: Set<String>) {
        val user = userRepository.getUser(userId)
        user.addresses = addresses
        user.contacts = contacts
    }

    fun getContactByType(userId: String, contactType: String): Set<Contact?>? {
        val user: User = userRepository.getUser(userId)
        val contacts: Set<Contact> = user.addresses
        return contacts.stream()
            .filter { c: Contact -> c.type == contactType }
            .collect(Collectors.toSet())
    }

    fun getAddressByRegion(userId: String, state: String): MutableSet<Any>? {
        val user: User = userRepository.getUser(userId)
        val addresses: Set<Address> = user.getAddresses()
        return addresses.stream()
            .filter(Predicate<Address> { a: Address -> a.getState().equals(state) })
            .collect(Collectors.toSet<Any>())
    }
}