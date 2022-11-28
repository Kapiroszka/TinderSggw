package com.pl.sggw.tinder.domain.match

interface MatchDecisionRepository {
   fun addDecision(userDecisionDto : UserDecisionDto)
}