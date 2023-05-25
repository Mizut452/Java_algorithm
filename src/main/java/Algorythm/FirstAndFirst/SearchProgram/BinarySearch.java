package Algorythm.FirstAndFirst.SearchProgram;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {2, 3, 4, 5, 6, 8, 10, 12, 19, 20, 30};
        Scanner sc = new Scanner(System.in);
        int searchValue = sc.nextInt();
        int findID = -1;
        int left = 0;
        int right = data.length - 1;

        while(left <= right) {
            int middle = (left + right) / 2;
            if(data[middle] == searchValue) {
                findID = middle;
                break;
            } else if (data[middle] < searchValue) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }


        System.out.println(findID + "番目にあります。");
    }
}
