package calc;

import org.jetbrains.annotations.NotNull;

import java.util.TreeMap;


public class convert {
    TreeMap < Character, Integer > romanKeyMap = new TreeMap<>();
    TreeMap < Integer, String > arabianKeyMap = new TreeMap<>();


    public convert(){
        romanKeyMap.put('I',1);
        romanKeyMap.put('V',5);
        romanKeyMap.put('X',10);

        arabianKeyMap.put(1,"I");
        arabianKeyMap.put(2,"II");
        arabianKeyMap.put(3,"III");
        arabianKeyMap.put(4,"IV");
        arabianKeyMap.put(5,"V");
        arabianKeyMap.put(6,"VI");
        arabianKeyMap.put(7,"VII");
        arabianKeyMap.put(8,"VIII");
        arabianKeyMap.put(9,"IX");
        arabianKeyMap.put(10,"X");
    }

    public boolean isRoman(String number){
        return romanKeyMap.containsKey(number.charAt(0));
    }

    public String romanToInt(int number){
        String roman = "";
        int arabianKey;
        do {
            arabianKey = arabianKeyMap.floorKey(number);
            roman +=arabianKeyMap.get(arabianKey);
            number -= arabianKey;
        }while (number !=0);
        return roman;
    }

    public int romanToInt(String s){
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = romanKeyMap.get(arr[end]);
        for (int i = end - 1; i >= 0; i--) {
            arabian = romanKeyMap.get(arr[i]);

            if (arabian < romanKeyMap.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }


        }
        return result;
    }


}
