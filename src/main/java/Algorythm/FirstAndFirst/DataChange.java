package Algorythm.FirstAndFirst;

import java.util.Scanner;

public class DataChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int avoid;
        avoid = first;
        first = second;
        second = avoid;
        System.out.println("もとは, 最初="+ second + "２つ目="+ first + "だったのが、最初=" + first + "二つ目 = " + second+"になりました。");

    }
}
