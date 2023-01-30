package com.vaiki.compositionnumber.domain.usecases

import com.vaiki.compositionnumber.domain.entity.Question
import com.vaiki.compositionnumber.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    companion object {
        const val COUNT_OF_OPTIONS = 6
    }
}
