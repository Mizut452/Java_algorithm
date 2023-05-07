package Algorythm.Paiza;

import java.util.ArrayList;
import java.util.Scanner;

public class BallBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boxNumber = scanner.nextInt();
        int radius = scanner.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < boxNumber; i++) {
                int height = scanner.nextInt();
                int width = scanner.nextInt();
                int depth = scanner.nextInt();
                int min = height;

                if(min > width) {
                    min = width;
                }

                if (min > depth) {
                    min = depth;
                }

                if(min <= radius * radius) {
                    answer.add(i);
                }
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }


    }
}
