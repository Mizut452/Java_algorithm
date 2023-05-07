package Algorythm.Paiza;

import java.util.Scanner;

public class CandleStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockDays = sc.nextInt();
        int firstValue = 0;
        int lastValue = 0;
        int highestValue = 0;
        int lowestValue = 0;

        for (int i = 0; i < stockDays; i++) {
            int acceptFirstValue = sc.nextInt();
            int acceptLastValue = sc.nextInt();
            int acceptHighestValue = sc.nextInt();
            int acceptLowestValue = sc.nextInt();

            if(highestValue < acceptHighestValue) {
                highestValue = acceptHighestValue;
            }

            if(lowestValue > acceptLowestValue) {
                lowestValue = acceptLowestValue;
            }

            if(i == 0) {
                lowestValue = acceptLowestValue;
                firstValue = acceptFirstValue;
            }

            if(i == stockDays - 1) {
                lastValue = acceptLastValue;
            }
        }

        System.out.println(firstValue + " " + lastValue + " " + highestValue + " " + lowestValue);

    }
}
