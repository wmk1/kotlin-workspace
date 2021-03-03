package com.example.demo.cqrs.projection


import com.example.demo.cqrs.repository.UserReadRepository


class UserProjection {

    private var readRepository: UserReadRepository? = null
    fun UserProjection(readRepository: UserReadRepository?) {
        this.readRepository = readRepository
    }

}