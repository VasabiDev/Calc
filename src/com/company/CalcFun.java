package com.company;

public class CalcFun {

    // метод для вычислений - сам калькулятор
    public static  void Calc (String[] separated) {

        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(separated[0]) || (roman[i].equals(separated[2]))) {
                System.out.println(" Вычисление невозможно");
            }
        }
        int a = Integer.parseInt(separated[0]);
        int b = Integer.parseInt(separated[2]);


            String operation = separated[1];
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


            }
           // System.out.println(result);

    }


}