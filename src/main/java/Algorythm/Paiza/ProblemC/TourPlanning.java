package Algorythm.Paiza.ProblemC;

import java.util.Arrays;
import java.util.Scanner;

public class TourPlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int landMarkAmount = sc.nextInt();
        //観光地番号とその滞在時間の配列
        int[] landMarkStaying = new int[landMarkAmount];
        for (int i = 0; i < landMarkAmount; i++) {
            landMarkStaying[i] = sc.nextInt();
        }

        //移動時間の配列
        int[][] landMarkMoving = new int[landMarkAmount][landMarkAmount];
        //３次元配列に値を入れるコード
        for (int i = 0; i < landMarkMoving.length; i++) {
            for (int j = 0; j < landMarkMoving[i].length; j++) {
                landMarkMoving[i][j] = sc.nextInt();
            }
        }

        //行きたい観光数
        int visitLandMarkNumber = sc.nextInt();
        int[] visitLandMark = new int[visitLandMarkNumber];
        for (int i = 0; i < visitLandMarkNumber; i++) {
            visitLandMark[i] = sc.nextInt();
        }
        int totalTime = 0;
        int preLandMark = 0;
        //時間の計算
        for (int i = 0; i < visitLandMarkNumber; i++) {

            int landMark = visitLandMark[i];
            if(i > 0) {
                totalTime += landMarkMoving[preLandMark - 1][landMark - 1];
            }
            totalTime += landMarkStaying[landMark - 1];
            preLandMark = landMark;
        }
        System.out.println(totalTime);

    }
}
