package com.pl.sggw.tinder.domain.addUser

import java.time.LocalDateTime

data class AddUserDto (
    val user_name : String,
    var password : String,
    val user_email : String,
    val time : LocalDateTime
        ){
}