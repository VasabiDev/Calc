package com.company;

public class CalcFun {

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