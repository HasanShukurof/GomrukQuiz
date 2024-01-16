package com.hasanshukurov.gomrukquiz.util

import com.hasanshukurov.gomrukquiz.model.QuestionModel

object ListOne {

    fun getListOne(): ArrayList<QuestionModel> {

        val questionList = ArrayList<QuestionModel>()

        val que1 = QuestionModel(
            1,
            "Malların və nəqliyyat vasitələrinin gömrük sərhədindən keçirilməsi üçün hansı dəhlizlərdən istifadə olunur?",
            "A) Yaşıl, Mavi, Narıncı",
            "B) Qırmızı, Sarı, Qara",
            "C) Yaşıl, Mavi, Sarı, Qırmızı",
            "D) Yaşıl, Qırmızı",
            3
        )

        val que2 = QuestionModel(
            2,
            "İdxal rüsumundan azad edilen Azad ticarət sazişi olan ölkələrdən mallar gətiriləndə hansı sertifikat təqdim edilməlidir ki, idxal rüsumu alınmasın?",
            "A) CT-1 mənşə sertifikatı",
            "B) Gigiyenik sertifikatı",
            "C) Düzgün cavab yoxdur",
            "D) A və B",
            1
        )

        val que3 = QuestionModel(
            3,
            "1300 metrdən hündürlükdə yerləşən dağlıq ərazilərdə turizm sahəsində olan investisiya layihələrinin həyata keçirilməsi üçün, ehtiyaclarını yerli xammal və materiallar hesabına ödəmək mümkün olmadıqda, layihə çərçivəsində idxal edilən mallar ödənişə necə cəlb olunur?",
            "A) İdxal rusumu 0%, ƏDV 18%",
            "B) İdxal rüsumundan azaddır, ƏDV 18%",
            "C) İdxal rüsumu və ƏDV-dən azaddır",
            "D) İdxal rüsumu tutulur, ƏDV-dən azaddır",
            2
        )

        val que4 = QuestionModel(
            4,
            "Aşağıdakı Mal qruplarından hansı ixrac rüsumuna cəlb olunmur?",
            "A) 71",
            "B) 74",
            "C) 41",
            "D) 44",
            1
        )

        val que5 = QuestionModel(
            5,
            "Daxildə emal xüsusi gömrük prosedurunun müddəti nə qədərdir?",
            "A) 1 il,",
            "B) 2 il",
            "C) 3 il",
            "D) Müddətsizdir",
            2
        )

        val que6 = QuestionModel(
            6,
            "Təkrar ixrac gömrük prosedurunun müddəti nə qədərdir?",
            "A) 1 il",
            "B) 2 il",
            "C) 3 il",
            "D) Müddətsizdir",
            4
        )

        val que7 = QuestionModel(
            7,
            "Aşağdakılardan hansında əlavə bəyannamə verilmir?",
            "A) Sio",
            "B) Yardım yükləri",
            "C) Fiziki şəxslər tərəfindən istehsal, yaxud kommersiya məqsədləri üçün nəzərdə tutulmayan malların gömrük sərhədindən keçirilərkən",
            "D) Hər üçündə verilir ",
            3
        )

        val que8 = QuestionModel(
            8,
            "Müvəqqəti idxal gömrük prosedurunun müddəti nə qədərdir?",
            "A) 12 ay",
            "B) 24 ay ",
            "C) 36 ay",
            "D) Müddətsizdir",
            2
        )

        val que9 = QuestionModel(
            9,
            "Müvəqqəti idxal zamanı muddət 12 ayadək uzadılarsa, müddət yeniden ne qədər uzadıla bilər?",
            "A) 1 il",
            "B) 2 il",
            "C) 3 il",
            "D) Uzadıla bilməz",
            4
        )

        val que10 = QuestionModel(
            10,
            "Malların gömrük nəzarəti altında bir gömrük orqanından digər gömrük orqanına daşınmasından ibarət xüsusi gömrük proseduru hansədər?",
            "A) Tranzit",
            "B) Sərbəst dovriyyəyə buraxılış",
            "C) Son istifadə",
            "D) Müvəqqəti idxal",
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