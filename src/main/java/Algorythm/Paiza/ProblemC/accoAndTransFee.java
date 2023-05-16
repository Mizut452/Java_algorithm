package Algorythm.Paiza.ProblemC;

import java.util.Scanner;

public class accoAndTransFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bulletFee = sc.nextInt();
        int hotelFee = sc.nextInt();
        int internshipAmount = sc.nextInt();
        int amountFee = 0;
        int preSecondDay = 0;
        for (int i = 0; i < internshipAmount; i++) {

            int firstDay = sc.nextInt();
            if(i > 0) {
                int dayDifference = firstDay - preSecondDay;
                if(hotelFee * dayDifference > bulletFee * 2) {
                    amountFee += bulletFee * 2;
                } else {
                    amountFee += hotelFee * dayDifference;
                }
            }
            int secondDay = sc.nextInt();
            preSecondDay = secondDay;
            if (i == 0) {
                amountFee += bulletFee * 2;
            }
        }

        System.out.println(amountFee);
    }
}
