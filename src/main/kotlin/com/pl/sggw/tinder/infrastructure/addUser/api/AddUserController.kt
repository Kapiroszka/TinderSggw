package com.pl.sggw.tinder.infrastructure.addUser.api

import com.pl.sggw.tinder.domain.addUser.AddUserRepository
import com.pl.sggw.tinder.domain.addUser.AddUserDto
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime


@Api(value = "add-user", description = "Rest api for adding new user")
@RequestMapping("/api/add-user")
@RestController
class AddUserController(val addUserRepository: AddUserRepository) {

    @PostMapping("/add-user")
    @ApiOperation("Add new tinder user")
    fun addUser(@RequestBody request : AddUserRequest){
        addUserRepository.addUser(
            AddUserDto(
            user_name = request.user_name,
            password =  request.password,
            user_email = request.user_email,
            time =  OffsetDateTime.now().toLocalDateTime()
        )
        )
    }
}