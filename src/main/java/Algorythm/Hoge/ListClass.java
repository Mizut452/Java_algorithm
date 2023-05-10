package Algorythm.Hoge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 5, 6};
        String[] str = {"吉田", "田中", "浦和"};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));

        int index = Arrays.binarySearch(arr, 3);
        System.out.println(index);

        List<String> studentList = new ArrayList<>();
        List<String> memberList = new LinkedList<>();
    }
}
