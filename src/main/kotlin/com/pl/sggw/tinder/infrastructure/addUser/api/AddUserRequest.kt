package com.pl.sggw.tinder.infrastructure.addUser.api

data class AddUserRequest (
        val user_name : String,
        var password : String,
        val user_email : String
        )
