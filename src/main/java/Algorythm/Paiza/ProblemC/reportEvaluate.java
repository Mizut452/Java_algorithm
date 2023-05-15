package Algorythm.Paiza.ProblemC;

import java.util.Scanner;

public class reportEvaluate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentNumber = sc.nextInt();
        int questionNumber = sc.nextInt();


        for (int i = 0; i < studentNumber; i++) {
            //1問当たりの配点
            int studentSubmitDay = sc.nextInt();
            int studentCorrect = sc.nextInt();
            int allotment = 100 / questionNumber;
            int studentPoints = studentCorrect * allotment;

            //提出日の減点
            if (studentSubmitDay > 0) {
                if (studentSubmitDay < 10) {
                    studentPoints = (int) (studentPoints * 0.8);
                } else {
                    studentPoints = 0;
                }
            }
                //評価
                if ( studentPoints >= 80) {
                    System.out.println("A");
                } else if (studentPoints >= 70) {
                    System.out.println("B");
                } else if (studentPoints >= 60) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }

        }
    }
}
