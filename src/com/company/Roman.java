package com.company;

public class Roman {
    public static int RomanCalc (String[] separated) {
        String aStr= separated[0];
        int a = 0;

        String operation = separated[1];

        String bStr =separated[2];
        int b = 0;

        int result = 0;

        a =RomantoInt(aStr);
        b =RomantoInt(bStr);

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

    public static int RomantoInt(String c){
        int res=0;
        switch (c){

            case "I":
                res=1;
                break;
            case "II":
                res=2;
                break;
            case "III":
                res=3;
                break;
            case "IV":
                res=4;
                break;
            case "V":
                res=5;
                break;
            case "VI":
                res=6;
                break;
            case "VII":
                res=7;
                break;
            case "VIII":
                res=8;
                break;
            case "IX":
                res=9;
                break;
            case "X":
                res=10;
                break;
        }
        return res;
    }

}




















































