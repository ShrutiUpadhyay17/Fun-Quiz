package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()


        val que1 = Question(
             1, "Which BTS member is in this picture?",
              R.drawable.rm,
             "Jungkook" ,
            "Kim Taehyung" ,
            "WWH Jin" ,
            " RapMonster",
            4

        )
        questionList.add(que1)



        val que2 = Question(
            2, "Which BTS member is in this picture?",
            R.drawable.jk,
            "Jungkook" ,
            "Suga" ,
            "Jimin" ,
            "Jhope",
            1

        )
        questionList.add(que2)



        val que3 = Question(
            3, "Which BTS member is in this picture?",
            R.drawable.suga,
            "Suga" ,
            "Kim Taehyung" ,
            "Jungkook" ,
            "Jimin",
            1

        )
        questionList.add(que3)



        val que4 = Question(
            4, "Which BTS member is in this picture?",
            R.drawable.v,
            "WWH Jin" ,
            "Kim Taehyung" ,
            "Jungkook" ,
            " RapMonster",
            2

        )
        questionList.add(que4)



        val que5 = Question(
            5, "Which BTS member is in this picture?",
            R.drawable.jin,
            "Jungkook" ,
            "Kim Taehyung" ,
            "WWH Jin" ,
            " RapMonster",
            3

        )
        questionList.add(que5)



        val que6 = Question(
            6, "Which BTS member is in this picture?",
            R.drawable.jimina,
            "Jungkook" ,
            "Kim Taehyung" ,
            "Jimin" ,
            "JHope",
            3

        )
        questionList.add(que6)



        val que7 = Question(
            7, "Which BTS member is in this picture?",
            R.drawable.jhope,
            "Jungkook" ,
            "Jhope" ,
            "WWH Jin" ,
            " RapMonster",
            2

        )
        questionList.add(que7)

        return questionList
    }
}