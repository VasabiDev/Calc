package com.company;

public class CalcFun {
    // метод для вычислений - сам калькулятор
    public static void Calc(String operation, int a, int b) {
        switch (operation) {
            case ("+"):
                System.out.println(a + b);
                break;
            case ("-"):
                System.out.println(a - b);
                break;
            case ("*"):
                System.out.println(a * b);
                break;
            case ("/"):
                System.out.println(a / b);
                break;
        }
    }

}