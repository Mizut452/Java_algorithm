package Algorythm.FirstAndFirst;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int average = 0;
        int[] figures = new int[3];
        figures[0] = first;
        figures[1] = second;
        figures[2] = third;

        for (int i = 0; i < figures.length; i++) {
            average += figures[i];
        } System.out.println(average / figures.length);
    }
}
