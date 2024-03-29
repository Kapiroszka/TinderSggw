package com.pl.sggw.tinder.domain.addUser

interface UserRepository {
    fun addUser(userDto : UserDto)
    fun upsertUserDetails(userDetailsDto: UserDetailsDto)
    fun findUserDetailsByEmail(userEmail: String): UserDetailsDto?
    fun getUserDetailsById(userId: Long): UserDetailsDto
    fun getAllPossiblePartnerForUser(userPreferencesDto: UserPreferencesDto): List<UserDetailsDto>
    fun upsertUserPreferences(userPreferencesDto: UserPreferencesDto)
    fun getUserPreferences(userEmail: String): UserPreferencesDto?
    fun getUserId(userEmail: String): Long
    fun findUserId(userEmail: String): Long?

}