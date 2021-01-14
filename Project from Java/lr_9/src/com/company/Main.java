package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //String[] alphab = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        String alf = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String key_1 = "криптографическиепреобразованияимеютцельобеспечитьнедоступностьинформациидлялицнеимеющихключаиподдержаниестребуемойнадежностьюобнаружениянесанкционированныхискажений";
        String key_2 = new String("чцларъшцфчцхрфзёьщцйцтычхцщьжцчцларъшцфчцхрфзёьщцйцтычхцщьжцишзьрфгэчшмцишзпцйзхрсфхцомщьйзцьтшгьгэлзххгэхзфхцомщьйцпзаръшцйзххгэлзххгэпзлзйзмфгэтуёяцфрзукцшрьфцфчшмцишзпцйзхрж");
        String[] transform_key_1 = key_1.split("");
        String[] transform_key_2 = key_2.split("");
        String[] transform_alf = alf.split("");
        int[] num = new int[transform_alf.length];
        int m = 0;

        for (int i = 0; i < transform_alf.length; i++) {
            for (int j = 0; j < transform_key_1.length; j++) {
                if ()
                    //num[i]++;
                    m++;
            }
        }
        System.out.println(m);
        /*for (int i = 0; i < transform_alf.length; i++)
            System.out.println(transform_alf[i] + " = " + num[i]);*/



    }
}
