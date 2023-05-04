package Algorythm.Hoge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mond {
    public static void main(String[] args) {
        int[] studentNumber = new int[5];
        studentNumber[0] = 1;
        studentNumber[1] = 3;
        studentNumber[2] = 5;
        studentNumber[4] = 6;
        System.out.println(Arrays.toString(studentNumber));
        int index = 2;
        System.out.println(studentNumber[index]);

        String studentName = "ディッセンバー山田";
        String[] studentNames = {studentName, "カクバル鈴木"};
        System.out.println(Arrays.toString(studentNames));


    }
}
