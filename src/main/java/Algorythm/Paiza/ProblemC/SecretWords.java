package Algorythm.Paiza.ProblemC;

import java.util.Scanner;

public class SecretWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secret = sc.next();
        String inputWord = sc.next();
        int count = 0;

        for (int i = 0; i < secret.length(); i++) {
            char secWord = secret.charAt(i);
            for (int j = 0; j < inputWord.length(); j++) {
                if(secWord == inputWord.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if(secret.equals(inputWord)) {
            System.out.println("NO");
        } else if (count == secret.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
