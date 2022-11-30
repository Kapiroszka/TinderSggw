package com.pl.sggw.tinder.domain.addUser

interface AddUserRepository {
    fun addUser(addUserDto : AddUserDto)
}