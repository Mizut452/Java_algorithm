package Algorythm.FirstAndFirst.SearchProgram;

import java.util.Scanner;

public class SearchValueSequential {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 5, 6};
        Scanner sc = new Scanner(System.in);
        int searchValue = sc.nextInt();
        int findID = -1;

        for (int i = 0; i < data.length; i++) {
            if(searchValue == data[i]) {
                findID = i;
                break;
            }
        }
        if (findID == -1) {
            System.out.println(searchValue + "はデータから見つかりませんでした。");
        } else {
            System.out.println(searchValue + "はデータの" + findID +"番目に格納されています。");
        }
    }
}
