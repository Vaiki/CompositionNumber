package com.vaiki.compositionnumber.domain.repository

import com.vaiki.compositionnumber.domain.entity.GameSettings
import com.vaiki.compositionnumber.domain.entity.Level
import com.vaiki.compositionnumber.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question


    fun getGameSetting(level: Level): GameSettings
}