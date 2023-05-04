package Algorythm.FirstAndFirst;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int max = first;

        if(max < second) {
            max = second;
        }

        if (max < third) {
            max = third;
        }

        System.out.println(max);
    }
}
