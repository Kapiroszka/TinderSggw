package com.pl.sggw.tinder.infrastructure.match.api

import com.pl.sggw.tinder.domain.match.MatchDecisionRepository
import com.pl.sggw.tinder.domain.match.UserDecisionDto
import com.pl.sggw.tinder.jooq.tables.references.USER_MATCH_DECITION
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
class JooqMatchDecisionRepository(val ctx: DSLContext) : MatchDecisionRepository {
    override fun addDecision(userDecisionDto: UserDecisionDto) {
        ctx.insertInto(USER_MATCH_DECITION)
            .columns(
                USER_MATCH_DECITION.SELECTING_USER_ID,
                USER_MATCH_DECITION.SELECTED_USER_ID,
                USER_MATCH_DECITION.SELECTED_USER_APPROVED,
                USER_MATCH_DECITION.CREATION_TIMESTAMP,
                USER_MATCH_DECITION.MODIFICATION_TIMESTAMP
            )
            .values(
                userDecisionDto.selectingUserId,
                userDecisionDto.selectedUserId,
                userDecisionDto.selectedUserApproved,
                userDecisionDto.time,
                userDecisionDto.time
            )
            .execute()
    }
}