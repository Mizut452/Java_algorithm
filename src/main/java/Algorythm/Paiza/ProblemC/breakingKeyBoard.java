package Algorythm.Paiza.ProblemC;

import java.util.Scanner;

public class breakingKeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int[] durableKey = new int[26];
        //
        for (int i = 0; i < 26; i++) {
            durableKey[i] = sc.nextInt();
        }

        String typingStr = sc.next();
        for (int i = 0; i < typingStr.length(); i++) {
            char type = typingStr.charAt(i);
            for (int j = 0; j < 26; j++) {
                if (type == 97 + j) {
                    if (durableKey[j] > 0) {
                        stringBuilder.append(type);
                        durableKey[j] = durableKey[j] - 1;
                    }
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
