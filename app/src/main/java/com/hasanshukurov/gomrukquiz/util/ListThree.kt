package com.hasanshukurov.gomrukquiz.util

import com.hasanshukurov.gomrukquiz.model.QuestionModel

object ListThree {

    fun getListThree(): ArrayList<QuestionModel> {

        val questionList = ArrayList<QuestionModel>()


        val que1 = QuestionModel(
            1,
            "Natamam bəyannamə rəsmiləşdirildikdən sonra həmin mallara dair gömrük bəyannaməsi gömrük orqanına hansı müddətə təqdim edilməlidir?",
            "A) 30",
            "B) 45",
            "C) 15",
            "D) 10",
            1
        )

        val que2 = QuestionModel(
            2,
            "Qısa idxal bəyannaməsi hansı formada verili?",
            "A) Elektron",
            "B) Yazılı",
            "C) Şifahi",
            "D) A və B",
            1
        )

        val que3 = QuestionModel(
            3,
            "Malların məhvinin təhlükəli və ya radioaktiv tullantıların (qalıqların) atılması, axıdılması və anbarlaşdırılması ilə bağlı olmasına ehtimal olduqda, belə məhvetməyə qanunvericilikdə nəzərdə tutulduğu hallarda hansı müvafiq icra hakimiyyəti orqanlarının iştirakı ilə heyata keçirilir?",
            "A) Fövqəladə Hallar Nazirliyi, Səhiyyə Nazirliyi",
            "B) Fövqəladə Hallar Nazirliyi, Ekologiya və Təbii Sərvətlər Nazirliyi, Kənd Təsərrüfatı Nazirliyi, Səhiyyə Nazirliyi, İqtisadiyyat Nazirliyi",
            "C) Fövqəladə Hallar Nazirliyi, Ekologiya və Təbii Sərvətlər Nazirliyi, Kənd Təsərrüfatı Nazirliyi, Səhiyyə Nazirliyi",
            "D) B) Fövqəladə Hallar Nazirliyi, Səhiyyə Nazirliyi, İqtisadiyyat Nazirliyi",
            3
        )

        val que4 = QuestionModel(
            4,
            "Avropa ölkələrindən gələn avtomobillərə avro-4 neçənci ildən tətbiq edilir ?",
            "A) 2004",
            "B) 2005",
            "C) 2009",
            "D) 2011",
            2
        )

        val que5 = QuestionModel(
            5,
            "Vəzifəli konsulluq şəxsləri və onların onlarla birgə yaşadığı ailə üzvlərinin yükü idxal-ixracı qadağan edilən, yaxud karantin qanun və qaydaları ilə tənzimlənən əşyalardırsa, həmin əşyalar vəzifəli konsulluq şəxsi, yaxud onun ailə üzvlərinin iştirakı olmadan yoxlanıla bilər?",
            "A) Xeyr",
            "B) Bəli",
            "C) Qanunvericilikdə nəzərdə tutulmuş hallarda, Bəli",
            "D) Gömrük orqanının icazəsi əsasında",
            1
        )

        val que6 = QuestionModel(
            6,
            "Dəniz nəqliyyatında hansı göndərmə şərtlərindən istifadə olunur         1 CİF, 2 FAS, 3 FOB, 4 DES, 5 DEQ, 6 CFR?",
            "A) 1,2,3,6",
            "B) 2,3,4,5",
            "C) 3,5,6",
            "D) 1,2,5",
            1
        )

        val que7 = QuestionModel(
            7,
            "Aşağdakılardan hansı XİFMN-in struktur elementinə aid deyil?",
            "A) Şərh etmə qaydaları",
            "B) İstifadə olunan ölçü vahidləri",
            "C) Mal bölmələri və qrupları",
            "D) Malların mənşə ölkəsi",
            4
        )

        val que8 = QuestionModel(
            8,
            "Azərbaycan Respublikası XİFMN-də neçə rəqəmli koddan istifadə edir?",
            "A) 10",
            "B) 8",
            "C) 9",
            "D) 6",
            1
        )

        val que9 = QuestionModel(
            9,
            "Statistik dəyər ixrac olunan mallar üçün hansı qiymətlə müəyyən olunur?",
            "A) FOB",
            "B) CİF",
            "C) DDP",
            "D) CFR",
            1
        )

        val que10 = QuestionModel(
            10,
            "Gömrük işində malların təsnif olunma prosesində neçə kateqoriyadan istifadə olunur?",
            "A) 5",
            "B) 6",
            "C) 9",
            "D) 7",
            2
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