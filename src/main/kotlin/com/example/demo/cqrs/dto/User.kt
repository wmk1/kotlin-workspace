package com.example.demo.cqrs.dto


class User {


    constructor(userID: String, firstName: String, lastName: String)

    val userId: String = ""
    val firstName: String = ""
    val lastName: String = ""
    var addresses = setOf<Address>()
    var contacts = setOf<Contact>()


}