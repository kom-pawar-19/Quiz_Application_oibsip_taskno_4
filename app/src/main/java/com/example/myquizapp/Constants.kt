package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.india,
            "Chicago", "France", "India", "Gabon",
            3
        )
        questionsList.add(que1)


        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.argentina,
            "Argentina", "Greece", "New Zealand", "Australia",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.kuwait,
            "Sudan", "fiji", "Jordan", "Kuwait",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.australia,
            "Palestine", "Australia", "New Zealand", "Chicago",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.belgium,
            "Denmark", "Fiji", "Sudan", "Belgium",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.brazil,
            "Brazil", "Ireland", "India", "Iran",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.denmark,
            "Georgia", "Denmark", "Greece", "none of these",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.fiji,
            "Gabon", "Finland", "France", "Fiji",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.germany,
            "Germany", "Palestine", "Hungary", "Iran",
            1
        )
        questionsList.add(que9)



        return questionsList
}

    }
