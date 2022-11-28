package com.pl.sggw.tinder.infrastructure.match.api

import com.pl.sggw.tinder.domain.match.MatchDecisionRepository
import com.pl.sggw.tinder.domain.match.UserDecisionDto
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime


@Api(value = "user-matches", description = "Rest api for  user matches handling")
@RequestMapping("/api/user-matches")
@RestController
class MatchController(val matchDecisionRepository: MatchDecisionRepository) {

    @PostMapping("/add-decision")
    @ApiOperation("Add the user's decision about the potential partner")
    fun addUserDecision(@RequestBody request : AddUserDecisionRequest){
        matchDecisionRepository.addDecision(UserDecisionDto(
            selectingUserId = request.selectingUserId,
            selectedUserId =  request.selectedUserId,
            selectedUserApproved = request.selectedUserApproved,
            time = OffsetDateTime.now().toLocalDateTime()
            ))
    }
}