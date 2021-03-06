package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {
    public static boolean checkRoman;


    // проверка является ли число римским
    public static boolean checkRoman(String[] separated) {

        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        String[] arab = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        boolean Romanflag = false;

        List arabList = new ArrayList<>(Arrays.asList(arab));


        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(separated[0])){
                Romanflag = true;
                if (arabList.contains(separated[2])){
                    Romanflag = false;
                }

            }

        }
        return Romanflag;
    }


    // проверка размерности чисел
    public static boolean checkNumberSize(String[] separated) {
        int a = Integer.parseInt(separated[0]);
        int b = Integer.parseInt(separated[2]);

        if (a <= 0 || a > 10 || b <= 0 || b > 10) {
            System.out.println("throws Exception // т.к. Оба аргумента должны быть не меньше 1 и не больше 10");
            return false;
        } else return true;
    }
    // проверка длины массива

    public static boolean ArrayCheckLength(String[] separated) {

        if (separated.length > 3) {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            return false;
        } else return true;
    }

    // проверка оператора на корректность
    public static boolean operationCorrectly(String operation) {
        int count = 0;
        for (int i = 0; i < operation.length(); i++) {
            count++;
        }
        // проверяем, является ли оператор числом
        try {
            Double.parseDouble(operation);
            System.out.println("throws Exception // Оператор не должен являться числом");
        } catch (NumberFormatException e) {

        }

        if (count == 1) {
            return true;
        } else
            System.out.println("throws Exception // т.к. Неверный математический оператор");
        return false;

    }
    // проверка пересечения систем счисления
    public static boolean crossCheck(String[] separated) {
        boolean crossFlag = true;
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        String[] arab = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};


        List separateList = new ArrayList<>(Arrays.asList(separated));
        boolean a = separateList.contains(arab);
        if (Check.checkRoman(separated)){
            if (a) {
                crossFlag = false;
                System.out.println("Пересечение типов");
            }
        }

      return crossFlag;
            }



    }


