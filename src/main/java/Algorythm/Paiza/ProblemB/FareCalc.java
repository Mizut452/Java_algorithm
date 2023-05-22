package Algorythm.Paiza.ProblemB;

import java.util.Scanner;

public class FareCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trainRoutes = sc.nextInt();
        int stationNum = sc.nextInt();


        int[][] fareTable = new int[trainRoutes][stationNum];

        for (int i = 0; i < trainRoutes; i++) {
            for (int j = 0; j < stationNum; j++) {
                fareTable[i][j] = sc.nextInt();
            }
        }

        int transferNum = sc.nextInt();
        int trainFare = 0;
        int preDest = 0;

        for (int i = 0; i < transferNum; i++) {
            int route = sc.nextInt();
            int destination = sc.nextInt();
            //routeTransfer = 9(fareTable[2][3]) - 7(fareTable[2][1])
            if(i == 0) {
                trainFare  += fareTable[route - 1][destination - 1];
            }

            if(i > 0) {
                if(fareTable[route - 1][preDest - 1] > fareTable[route - 1][destination - 1]) {
                    int routeTransfer = fareTable[route - 1][preDest - 1] - fareTable[route - 1][destination - 1];
                    trainFare += routeTransfer;
                } else {
                    int routeTransfer = fareTable[route - 1][destination - 1] - fareTable[route - 1][preDest - 1];
                    trainFare += routeTransfer;
                }
            }
            preDest = destination;
        }
        System.out.println(trainFare);
    }
}
