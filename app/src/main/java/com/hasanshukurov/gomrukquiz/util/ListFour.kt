package com.hasanshukurov.gomrukquiz.util

import com.hasanshukurov.gomrukquiz.model.QuestionModel

object ListFour {


    fun getListFour(): ArrayList<QuestionModel> {

        val questionList = ArrayList<QuestionModel>()


        val que1 = QuestionModel(
            1,
            "Diplomatik nümayəndəlik lər və diplomatlara məxsus mallar keçirildikdə GB-nin 36-cı qrafasında hansı rəqəm yazılır?",
            "A) 30",
            "B) 40",
            "C) 50",
            "D) 90",
            1
        )

        val que2 = QuestionModel(
            2,
            "Müvəqqəti idxal xüsusi gömrük proseduru altında yerləşdirilmiş mallar gömrük rüsumlarından və vergilərdən hansı müddətə tamamilə azad olunur ?",
            "A) 1 il",
            "B) 2 il",
            "C) 3 il",
            "D) 4 il",
            1
        )

        val que3 = QuestionModel(
            3,
            "İnzibati Xətalar Məcəlləsinin 130-cu maddəsinə əsasən inzibati xəta haqqında iş üzrə qərardan hansı müddətə şikayət verilə bilər?",
            "A) 5",
            "B) 10",
            "C) 15",
            "D) 30",
            2
        )

        val que4 = QuestionModel(
            4,
            "Gömrük ödənişlərinin ödənilməsindən yayınma xeyli miqdar nə qədərdir?",
            "A) Ödənilməmiş gömrük ödənişlərinin iyirmi min manatadək məbləği",
            "B) Ödənilməmiş gömrük ödənişlərinin iyirmi min manatdan yuxarı, lakin yüz min manatdan artıq olmayan məbləği",
            "C) Ödənilməmiş gömrük ödənişlərinin yüz min manatdan yuxarı, lakin beş yüz min manatdan artıq olmayan məbləği",
            "D) Ödənilməmiş gömrük ödənişlərinin beş yüz min manatdan yuxarı olan məbləği",
            2
        )

        val que5 = QuestionModel(
            5,
            "Bir gömrük bəyannaməsində ən çox neçə adda malı rəsmiləşdirmək olar ?",
            "A) 33-ə qədər",
            "B) 100-ə qədər",
            "C) 99-a qədər",
            "D) 90-a qədər",
            2
        )

        val que6 = QuestionModel(
            6,
            "GB-nin 5-ci qrafasında 33 yazılarsa neçə vərəqdən istifadə olunur?",
            "A) 10",
            "B) 11",
            "C) 12",
            "D) 13",
            3
        )

        val que7 = QuestionModel(
            7,
            "GB-nin 5-ci qrafasında 55 yazılarsa neçə vərəqdən istifadə olunur?",
            "A) 16",
            "B) 17",
            "C) 18",
            "D) 19",
            4
        )

        val que8 = QuestionModel(
            8,
            "Aşağıdakılardan hansı doğrudur?",
            "A) Netto > Brutto",
            "B) Netto >= Brutto",
            "C) Netto =< Brutto",
            "C) Netto = Brutto",
            3
        )

        val que9 = QuestionModel(
            9,
            "Mallar hansı prosedurda yerləşdiriləndə 10-cu qrafa doldurulur?",
            "A) Daxildə emal",
            "B) Xaricdə emal",
            "C) İxrac",
            "D) İdxal",
            3
        )

        val que10 = QuestionModel(
            10,
            "Əsas və əlavə vərəqlərin 45-ci qrafalarında göstərilən malların ümumi gömrük dəyəri neçənci qrafada göstərilir ?",
            "A) 12",
            "B) 22",
            "C) 42",
            "D) 45",
            1
        )




        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)



        return questionList

    }


}