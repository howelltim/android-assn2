package com.android.example.app_wowquiz_assn2.game

import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.example.app_wowquiz_assn2.R
import com.android.example.app_wowquiz_assn2.databinding.FragmentGameBinding

data class Question(
    val questionId: Int,
    val answer: Boolean,
    var attempted: Boolean = false,
    var answeredCorrect: Boolean = false
)

class GameViewModel: ViewModel() {

    private var correctQuestions = 0
    private var numAttempted = 0
    private var questionIndex = 0
    private lateinit var questionBank: MutableList<Question>

    //store the current question
    private val _question = MutableLiveData<Int>(questionBank[questionIndex].questionId)
        val question: LiveData<Int>
            get() = _question

    //store the current answer
    private val _answer = MutableLiveData<Boolean>(questionBank[questionIndex].answer)
        val answer: LiveData<Boolean>
            get() = _answer

    //store if the question is attempted
    private val _attempted = MutableLiveData<Boolean>(false)
        val attempted: LiveData<Boolean>
            get() = _attempted

    //store if the user got the correct answer
    private val _answeredCorrect = MutableLiveData<Boolean>(false)
        val answeredCorrect: LiveData<Boolean>
            get() = _answeredCorrect

    //private variable for enabling the buttons
    //need to pass this to the fragment
    private val _enableButtons = MutableLiveData<Boolean>(true)
        val enableButtons: LiveData<Boolean>
            get() = _enableButtons

    //format string for the score
    private val _scoreFormatString = MutableLiveData<String>()
        val scoreFormatString: LiveData<String>
            get() = _scoreFormatString

    init{
        resetGame()
        updateQuestion()
    }

    fun checkAnswer(answer: Boolean){
        if (answer == questionBank[questionIndex].answer){
            correctQuestions++
            questionBank[questionIndex].answeredCorrect = true
        }
        questionBank[questionIndex].attempted = true
        numAttempted++
        updateQuestion()
    }

    fun next(){
        if (questionIndex++ < questionBank.size - 1){
            questionIndex++
        }
        updateQuestion()
    }
    fun prev(){
        if(questionIndex-- > 0){
            questionIndex--
        }
        updateQuestion()
    }

    private fun resetGame(){
        correctQuestions = 0
        numAttempted = 0
        questionIndex = 0
        resetQuestionBank()
        updateQuestion()
    }

    private fun updateQuestion(){
        _question.value = questionBank[questionIndex].questionId
        _answer.value = questionBank[questionIndex].answer
        _attempted.value = questionBank[questionIndex].attempted
        _answeredCorrect.value = questionBank[questionIndex].answeredCorrect
        _enableButtons.value = !questionBank[questionIndex].attempted
        _scoreFormatString.value = "Score: ${correctQuestions}/${numAttempted}"
    }

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
}