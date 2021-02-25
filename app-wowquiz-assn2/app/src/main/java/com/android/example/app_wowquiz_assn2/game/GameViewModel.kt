package com.android.example.app_wowquiz_assn2.game

import androidx.lifecycle.ViewModel
import com.android.example.app_wowquiz_assn2.R

class GameViewModel: ViewModel() {
    private lateinit var questionBank: MutableList<Question>

    private var questionIndex: Int = 0

    private fun resetQuestionBank(){
        questionBank = mutableListOf(
            Question(R.string.question_1, false),
            Question(R.string.question_2, true),
            Question(R.string.question_3, false),
            Question(R.string.question_4, true),
            Question(R.string.question_5, false),
            Question(R.string.question_6, true),
            Question(R.string.question_7, false),
            Question(R.string.question_8, true),
            Question(R.string.question_9, false),
            Question(R.string.question_10, true)
        )
        questionBank.shuffle()
    }
    private fun updateQuestion(){

    }
}