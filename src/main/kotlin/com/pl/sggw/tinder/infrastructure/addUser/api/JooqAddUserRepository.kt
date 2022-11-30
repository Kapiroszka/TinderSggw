package com.pl.sggw.tinder.infrastructure.addUser.api

import com.pl.sggw.tinder.domain.addUser.AddUserDto
import com.pl.sggw.tinder.domain.addUser.AddUserRepository

import com.pl.sggw.tinder.jooq.tables.references.TINDER_USER
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
class JooqAddUserRepository(val ctx: DSLContext) : AddUserRepository{
    override fun addUser(addUser: AddUserDto) {
        ctx.insertInto(TINDER_USER)
            .columns(
                TINDER_USER.USER_NAME,
                TINDER_USER.PASSWORD,
                TINDER_USER.USER_EMAIL,
                TINDER_USER.CREATION_TIMESTAMP,
                TINDER_USER.MODIFICATION_TIMESTAMP
            )
            .values(
                addUser.user_name,
                addUser.password,
                addUser.user_email,
                addUser.time,
                addUser.time
            )
            .execute()
    }
}