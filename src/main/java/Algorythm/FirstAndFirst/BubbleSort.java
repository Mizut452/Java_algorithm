package Algorythm.FirstAndFirst;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {10, 3, 1, 4, 2};
        System.out.println(Arrays.toString(data));

        for(int i = 0; i < data.length - 1; i++) {
            for(int j = data.length - 1; j > i; j--) {
                if(data[j] < data[j - 1]) {
                    int tentative = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tentative;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
