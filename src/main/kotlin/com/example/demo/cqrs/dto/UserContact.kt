package com.example.demo.cqrs.dto

class UserContact {

    val addressByRegion: Map<String, Set<Address>> = HashMap()

}