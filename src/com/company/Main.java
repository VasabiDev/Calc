package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        System.out.println("Введите в строку пример, содержащий два числа от 1 до 10");

        try {
            // получаем строку пользовательноского ввода
            Scanner input = new Scanner(System.in);
            String inputStr = input.nextLine();

            // делим строку на элементы
            String[] separated = inputStr.split(" ");



            //цикл по прохождению всех проверок
            if(Check.checkRoman(separated) && Check.ArrayCheckLength(separated) && Check.operationCorrectly(separated[1])){
               Roman.RomanCalc(separated);
            } else if (Check.checkNumberSize(separated) && Check.ArrayCheckLength(separated) && Check.operationCorrectly(separated[1])) {
                CalcFun.Calc(separated);
            }


// обработка исключений
      //  } catch (NumberFormatException e) {
    //        System.out.println("throws Exception // т.к. Неверный формат ввода");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

