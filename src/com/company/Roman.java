package com.company;

public class Roman {
    public static void RomanCalc (String[] separated) {
        String aStr= separated[0];
        int a ;

        String operation = separated[1];

        String bStr =separated[2];
        int b ;

        int result =0;

        a =RomantoInt(aStr);
        b =RomantoInt(bStr);


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
           System.out.println(result);
        }
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




















































