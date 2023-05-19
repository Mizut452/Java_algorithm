package Algorythm.Paiza.ProblemC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DislikeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dislikeNumber = sc.nextInt();
        int bedroomNumber = sc.nextInt();
        int[] bedNumList = new int[bedroomNumber];
        for (int i = 0; i < bedroomNumber; i++) {
            int bedNumber = sc.nextInt();
            bedNumList[i] = bedNumber;
        }

        for (int bedNumber : bedNumList) {
            while(bedNumber != 0) {
                if(bedNumber % 10 != dislikeNumber) {
                  bedNumber /= 10;
                } else {

                }
            }

        }
    }
}
