package com.company;

public class Check {
// проверка размерности чисел
    public static boolean checkNumberSize(int a, int b) {
        if (a <= 0 || a > 10 || b <= 0 || b > 10) {
            System.out.println("throws Exception // т.к. Оба аргумента должны быть не меньше 1 и не больше 10");
            return false;
        } else return true;
    }
    // проверка длины массива
    public static boolean ArrayCheckLength(String[] inputStr) {

        if (inputStr.length > 3) {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            return false;
        } else return true;
    }

    public static boolean operationCorrectly(String operation) {
        int count = 0;
        for (int i = 0; i < operation.length(); i++) {
            count++;
        }

        if (count == 1) {

            return true;
        } else
            System.out.println("throws Exception // т.к. Неверный математический оператор");
        return false;

    }
}

