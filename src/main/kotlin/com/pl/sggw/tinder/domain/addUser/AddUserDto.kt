package com.pl.sggw.tinder.domain.addUser

import java.time.LocalDateTime

data class AddUserDto(
    val userName : String,
    var password : String,
    val userEmail : String,
    val time : LocalDateTime
)
