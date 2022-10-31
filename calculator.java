package calc;


import java.util.Scanner;

public class calculator {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String tx = scn.nextLine();
        tx = tx.replace(" ","");
        String[] sign = null;

        String act = null;

//////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////

        if(tx.contains("+")){
            sign = tx.split("\\+");
            act ="+";
        }
        else if(tx.contains("-")){
            sign = tx.split("-");
            act ="-";
        }
        else if(tx.contains("*")){
            sign = tx.split("\\*");
            act ="*";
        }
        else if (tx.contains("/")){
            sign = tx.split("/");
            act ="/";
        }
        else {
            throw new RuntimeException("Не верный знак операции");
        }
///////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////
        switch (act){
            case "+":
                int num = Integer.parseInt(sign[0]);
                int num1 = Integer.parseInt(sign[1]);
                if (num > 10 || num < 1 ||num1 > 10 || num1 < 1 ){
                    System.out.println("Введите число от 1 до 10 включительно.");
                    break;
                }
                System.out.print("Ответ: ");
                System.out.println(num + num1);

                break;
            case "-":
                int num2 = Integer.parseInt(sign[0]);
                int num3 = Integer.parseInt(sign[1]);
                if (num2 > 10 || num2 < 1 || num3 > 10 || num3 < 1 ){
                    System.out.println("Введите число от 1 до 10 включительно.");
                    break;
                }
                System.out.print("Ответ: ");
                System.out.println(num2 - num3);
                break;
            case "*":
                int num4 = Integer.parseInt(sign[0]);
                int num5 = Integer.parseInt(sign[1]);
                if (num4 > 10 || num4 < 1 || num5 > 10 || num5 < 1 ){
                    System.out.println("Введите число от 1 до 10 включительно.");
                    break;
                }
                System.out.print("Ответ: ");
                System.out.println(num4 * num5);
                break;
            case "/":
                int num6 = Integer.parseInt(sign[0]);
                int num7 = Integer.parseInt(sign[1]);
                if (num6 > 10 || num6 < 1 || num7 > 10 || num7 < 1 ){
                    System.out.println("Введите число от 1 до 10 включительно.");
                    break;
                }
                System.out.print("Ответ: ");
                System.out.println(num6 / num7);
                break;

        }
///////////////////////////////////////////////////////////////////


        }


    }

