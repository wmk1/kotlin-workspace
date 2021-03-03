package com.example.demo.cqrs.aggregate

import com.example.demo.cqrs.command.UpdateUserCommand

import com.example.demo.cqrs.command.CreateUserCommand
import com.example.demo.cqrs.dto.User
import com.example.demo.cqrs.repository.UserWriteRepository


class UserAggregate {

    private var userWriteRepository: UserWriteRepository? = null
    fun UserAggregate(repository: UserWriteRepository?) {
        userWriteRepository = repository
    }

    fun handleCreateUserCommand(command: CreateUserCommand): User? {
        val user = User(command.userId, command.firstName, command.lastName)
        userWriteRepository.addUser(user.userId, user)
        return user
    }

    fun handleUpdateUserCommand(command: UpdateUserCommand): User? {
        val user: User = userWriteRepository.getUser(command.userId)
        user.addresses = command.addresses
        user.contacts = command.contacts
        userWriteRepository.addUser(user.userId, user)
        return user
    }

}