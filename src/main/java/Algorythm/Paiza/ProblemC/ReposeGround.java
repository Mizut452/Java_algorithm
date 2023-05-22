package Algorythm.Paiza.ProblemC;

import java.util.Scanner;

public class ReposeGround {
    public static void main(String[] args) {
        int constructX = 20;
        int constructY = 10;
        int noiseSize =  10;
        int treeNum = 3;

        for (int i = 0; i < treeNum; i++) {
            int treeX = 25;
            int treeY = 10;
            double xLength = Math.pow(treeX - constructX, 2);
            double yLength = Math.pow(treeY - constructY, 2);
            double noisePow = Math.pow(noiseSize, 2);

            if((int) xLength + (int) yLength >= noisePow) {
                System.out.println("silent");
            } else {
                System.out.println("noisy");
            }
        }
    }
}
