package calc;


import java.util.OptionalInt;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        convert convert = new convert();
        int result = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String tx = scn.nextLine();
        tx = tx.replace(" ", "");
        String[] sign = null;

        String act = null;

//////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////

        if (tx.contains("+")) {
            sign = tx.split("\\+");
            act = "+";
        } else if (tx.contains("-")) {
            sign = tx.split("-");
            act = "-";
        } else if (tx.contains("*")) {
            sign = tx.split("\\*");
            act = "*";
        } else if (tx.contains("/")) {
            sign = tx.split("/");
            act = "/";
        } else {
            throw new RuntimeException("Не верный знак операции");
        }
///////////////////////////////////////////////////////////////////
        if (convert.isRoman(sign[0]) == convert.isRoman(sign[1])) {
            int a, b;
            boolean isRoman = convert.isRoman(sign[0]);
            if (isRoman){
                a = convert.romanToInt(sign[0]);
                b = convert.romanToInt(sign[1]);
            }else{
                a = Integer.parseInt(sign[0]);
                b = Integer.parseInt(sign[1]);
                if (a > 10 || a < 1 || b > 10 || b < 1) {
                    System.out.println("Введите число от 1 до 10 включительно.");
                    return;
                }

            }

            switch (act) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;

            }
            System.out.println(result);

        }else{
            System.out.println("Числа должны быть в одном формате.");
        }


///////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////


    }
}