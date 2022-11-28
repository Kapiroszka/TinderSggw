/*
 * This file is generated by jOOQ.
 */
package com.pl.sggw.tinder.jooq.keys


import com.pl.sggw.tinder.jooq.tables.TinderUser
import com.pl.sggw.tinder.jooq.tables.UserInformation
import com.pl.sggw.tinder.jooq.tables.UserMatchDecition
import com.pl.sggw.tinder.jooq.tables.records.TinderUserRecord
import com.pl.sggw.tinder.jooq.tables.records.UserInformationRecord
import com.pl.sggw.tinder.jooq.tables.records.UserMatchDecitionRecord

import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val TINDER_USER_PKEY: UniqueKey<TinderUserRecord> = Internal.createUniqueKey(TinderUser.TINDER_USER, DSL.name("tinder_user_pkey"), arrayOf(TinderUser.TINDER_USER.ID), true)
val USER_INFORMATION_USER_ID_KEY: UniqueKey<UserInformationRecord> = Internal.createUniqueKey(UserInformation.USER_INFORMATION, DSL.name("user_information_user_id_key"), arrayOf(UserInformation.USER_INFORMATION.USER_ID), true)
val USER_MATCH_DECITION_PKEY: UniqueKey<UserMatchDecitionRecord> = Internal.createUniqueKey(UserMatchDecition.USER_MATCH_DECITION, DSL.name("user_match_decition_pkey"), arrayOf(UserMatchDecition.USER_MATCH_DECITION.ID), true)
