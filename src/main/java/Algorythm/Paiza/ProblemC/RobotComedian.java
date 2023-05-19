package Algorythm.Paiza.ProblemC;

import java.util.HashMap;
import java.util.Scanner;

public class RobotComedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6; // ロボットが動く時間
        int m = 2; // 動作の数

        int[] a = new int[m];
        String[] b = new String[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt(); // 動作の発動時間
            b[i] = sc.next(); // 動作の名前
        }

        for (int i = 1; i <= n; i++) {
            boolean executed = false;
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < m; j++) {
                if (i % a[j] == 0) {
                    sb.append(b[j]).append(" ");
                    executed = true;
                }
            }

            if (!executed) {
                System.out.println(i);
            } else {
                System.out.println(sb.toString().trim());
            }
        }
    }
}
