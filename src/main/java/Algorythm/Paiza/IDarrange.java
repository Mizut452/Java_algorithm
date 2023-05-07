package Algorythm.Paiza;

import java.lang.reflect.Array;
import java.util.*;

public class IDarrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        Map<Integer, String> letterList = new HashMap<>();

        for (int i = 0; i < people; i++) {
            String userName = sc.nextLine();
            for (int j = 0; j < userName.length(); j++) {
                char letterSearch = userName.charAt(j);
                if(Character.isDigit(letterSearch)) {
                    String strNumber = userName.substring(j, userName.length());
                    int strNumbers = Integer.parseInt(strNumber);
                    letterList.put(strNumbers, userName);
                    break;
                }
            }

            Object[] mapkey = letterList.keySet().toArray();
            Arrays.sort(mapkey);

            for ( Integer n : letterList.keySet()) {
                System.out.println(letterList.get(n));
            }


        }

    }
}
