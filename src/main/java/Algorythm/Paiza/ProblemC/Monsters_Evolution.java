package Algorythm.Paiza.ProblemC;

import java.util.Arrays;
import java.util.Scanner;

public class Monsters_Evolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int atk = 0;
        int def = 0;
        int agi = 0;

        atk = sc.nextInt();
        def = sc.nextInt();
        agi = sc.nextInt();


        int monsterNumber = sc.nextInt();
        int[][] monsterList = new int[monsterNumber][6];
        String[] monsterNameList = new String[monsterNumber];
        for (int i = 0; i < monsterNumber; i++) {
            String monsterName = sc.next();
            monsterNameList[i] = monsterName;

            for (int j = 0; j < 6; j++) {
                int monsterPoint = sc.nextInt();
                monsterList[i][j] = monsterPoint;
            }

            if(atk > monsterList[i][0] || atk < monsterList[i][3]) {
                System.out.println("no evolution");
        } else if(def > monsterList[i][1] || def < monsterList[i][4]) {
                System.out.println("no evolution");
            } else if (agi > monsterList[i][2] || agi < monsterList[i][5]) {
                System.out.println("no evolution");
            } else {
                System.out.println(monsterName);
            }
        }


        System.out.println(Arrays.deepToString(monsterList));
        System.out.println(Arrays.toString(monsterNameList));
    }
}
