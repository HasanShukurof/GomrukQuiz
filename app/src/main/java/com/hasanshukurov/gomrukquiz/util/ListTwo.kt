package com.hasanshukurov.gomrukquiz.util

import com.hasanshukurov.gomrukquiz.model.QuestionModel

object ListTwo {

    fun getListTwo(): ArrayList<QuestionModel> {

        val questionList = ArrayList<QuestionModel>()


        val que1 = QuestionModel(
            1,
            "2000 kub sm-dək olan xarici minik avtomobili ölkəyə daxil olarkən 3 aya qədər ne qədər yol vergisi ödəyər?",
            "A) 30 dollar",
            "B) 40 dollar",
            "C) 20 dollar",
            "D) 60 dollar",
            1
        )

        val que2 = QuestionModel(
            2,
            "Bir oğlan restorana gəlir. 1-ci qapıdan girəndə qapıçıya 1 manat ödəyir içəri keçir.Restoranda pulunun yarısını xərcləyir və 1-ci qapıdan çıxır 1 manat ödəyir. Sonra yenə 2- ci qapıdan girir, qapıçıya 1 manat ödəyir, pulunun yarısını xərcləyir və 2-ci qapidan çıxanda 1 manat pul ödəyir. Eynilə 3-cü qapıdan da girir və çıxır. Sonra 4-cü qapıdan girəndə 1 manat qapıçıya ödəyir və restoranda pulun yarısını cərcləyib çıxanda qapıçıya1 manat pul verir. BU bir manat oğlanın cibindəki son manat idi. Sonuncu manatını qapıçıya ödəyib çıxır. Oğlanın nə qədər pulu var idi",
            "A) 44",
            "B) 45",
            "C) 46",
            "D) 47",
            2
        )

        val que3 = QuestionModel(
            3,
            "İri tonnajlı yük avtomobili hansı şəhərlərə daxil olarkən əlavə dövlət rüsumu ödəyir?",
            "A) Bakı, Sumqayıt, Gəncə",
            "B) Bakı, Şirvan, Gəncə",
            "C) Hacıqabul, Bakı, Sumqayıt",
            "D) Gəncə, Baki, Salyan",
            1
        )

        val que4 = QuestionModel(
            4,
            "Malların gömrük dəyərinə dair məcburi qərarlar hansı müddətə qüvvədə olur?",
            "A) Qərar verildiyi tarixdən etibarən 3 il müddətində",
            "B) Qüvvəyə mindiyi tarixdən etibarən 3 il müddətində",
            "C) Qərar verildiyi tarixdən etibarən 1 il müddətində",
            "D) Qüvvəyə mindiyi tarixdən etibarən 1 il müddətində",
            4
        )

        val que5 = QuestionModel(
            5,
            "Qısa idxal bəyannaməsinin mallar gömrük ərazisinə gətirilməzdən əvvəl elektron formada verilməməsinə görə hüquqi şəxslər nə qədər cərimələnir?",
            "A) 1000",
            "B) 1500",
            "C) 2000",
            "D) 500",
            2
        )

        val que6 = QuestionModel(
            6,
            "Tranzit bəyannaməsinin neçə elektron nüsxəsi var?",
            "A) 2",
            "B) 4",
            "C) 3",
            "D) 1",
            4
        )

        val que7 = QuestionModel(
            7,
            "Gömrük sərhədindən keçirilən malların uçotunun və onlar haqqında hesabatın düzgün aparılmaması faktı aşkar olunarsa, gömrük brokerlərinə hansı gomrük auditi keçirilir?",
            "A) Ümumi",
            "B) Xüsusi",
            "C) Üumu və xüsusi",
            "D) Doğru variant yoxdur",
            2
        )

        val que8 = QuestionModel(
            8,
            "Sio ilk dəfə harada yaradılıb?",
            "A) ABŞ və Kanada",
            "B) ABŞ və Yeni Zelandiya",
            "C) Sinqapur və ABŞ",
            "D) Yeni Zelandiya və İsveç",
            2
        )

        val que9 = QuestionModel(
            9,
            "Ayrı-ayrı sənədlərin üzrlü səbəblərə görə gömrük bəyannaməsi ilə birlikdə təqdim edilməsi mümkün olmadığı hallarda gömrük bəyannaməsi təsdiq edildikdən sonra hansı müddətə təqdim olunmasına icazə verirlər?",
            "A) 15",
            "B) 30",
            "C) 45",
            "D) 20",
            3
        )

        val que10 = QuestionModel(
            10,
            "Əlavə bəyannamə bəyannaməçi tərəfindən sadələşdirilmiş bəyannamənin verildiyi gömrük orqanına onun verildiyi tarixdən hansı gündən gec olmayaraq təqdim edilməlidir?",
            "A) 30",
            "B) 45",
            "C) 15",
            "D) 10",
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