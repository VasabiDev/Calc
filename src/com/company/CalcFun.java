package com.company;

public class CalcFun {

    // метод для вычислений - сам калькулятор
    public static int Calc(String[] separated) {

        int a = Integer.parseInt(separated[0]);
        String operation = separated[1];
        int b = Integer.parseInt(separated[2]);

        int result = 0;

        switch (operation) {
            case ("+"):
                System.out.println(a + b);
                result = a + b;
                break;
            case ("-"):
                System.out.println(a - b);
                result = a - b;
                break;
            case ("*"):
                System.out.println(a * b);
                result = a * b;
                break;
            case ("/"):
                System.out.println(a / b);
                result = a / b;
                break;
        } return result;
    }

}