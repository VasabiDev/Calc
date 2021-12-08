package com.company;

import java.util.Collections;

import static java.lang.String.join;

public class Roman {
    public static void RomanCalc (String[] separated) {

        // локализуем нужные нам элементы массива
        String aStr= separated[0];
        int a ;
        String bStr =separated[2];
        int b ;
        String operation = separated[1];

        int result =0;
        // перевод римских чисел в арабские
        a =RomantoInt(aStr);
        b =RomantoInt(bStr);

        // метод для вычислений - сам калькулятор для римских чисел
            switch (operation) {
                case ("+"):
                    // System.out.println(a + b);
                    result = a + b;
                    break;
                case ("-"):
                    // System.out.println(a - b);
                    result = a - b;
                    break;
                case ("*"):
                    //   System.out.println(a * b);
                    result = a * b;
                    break;
                case ("/"):
                    //   System.out.println(a / b);
                    result = a / b;
                    break;
            }

        if (result < 0){
            System.out.println("Результат не может мыть меньше 0");
        } else if (result >0) {

           System.out.println(IntToRoman(result));
        }
    }
    // метод перевода римских чисел в арабские
    public static int RomantoInt(String c){
        int res=0;
        switch (c){

            case "I": res=1;break;
            case "II": res=2;break;
            case "III": res=3;break;
            case "IV": res=4;break;
            case "V": res=5;break;
            case "VI": res=6;break;
            case "VII": res=7;break;
            case "VIII": res=8;break;
            case "IX": res=9;break;
            case "X": res=10;break;
        }
        return res;
    }
    // метод перевода арабских чисел в римские с помощью коллекций
    public static String IntToRoman(int number) {
        return join("", Collections.nCopies(number, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");

    }

}




















































