package com.vaiki.compositionnumber.domain.usecases

import com.vaiki.compositionnumber.domain.entity.GameSettings
import com.vaiki.compositionnumber.domain.entity.Level
import com.vaiki.compositionnumber.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSetting(level)
    }
}