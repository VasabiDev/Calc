package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        System.out.println("Введите в строку пример, содержащий два числа от 1 до 10");

        try {
            // получаем строку пользовательноского ввода
            Scanner input = new Scanner(System.in);
            String inputStr = input.nextLine();


            // делим строку на элементы и разносим по переменным с необходимым приведением типов
            String[] separated = inputStr.split(" ");
            int a = Integer.parseInt(separated[0]);
            String operation = separated[1];

            int b = Integer.parseInt(separated[2]);


            boolean check1 = Check.checkNumberSize(a, b);
            boolean check2 = Check.ArrayCheckLength(separated);
            boolean check3 = Check.operationCorrectly(operation);

            //цикл по прохождению всех проверок
            if (check1 && check2 && check3) {
                CalcFun.Calc(operation, a, b);

            }


        } catch (NumberFormatException e) {
            System.out.println("throws Exception // т.к. Неверный формат ввода");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "throws Exception //т.к. строка не является математической операцией");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}