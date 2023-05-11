package Algorythm.Paiza.ProblemD;

import java.util.Scanner;

public class LastLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        char lastLetter = letter.charAt(letter.length() - 1);
        System.out.println(lastLetter);
    }
}
