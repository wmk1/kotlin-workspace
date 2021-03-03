package com.example.demo.cqrs.dto

class UserAddress {

    val addressByRegion: Map<String, Set<Address>> = HashMap()

}