package com.example.demo.cqrs.command

import com.example.demo.cqrs.dto.Address
import com.example.demo.cqrs.dto.Contact

class UpdateUserCommand {
    val userId: String = ""
    var addresses = setOf<Address>()
    var contacts = setOf<Contact>()
}