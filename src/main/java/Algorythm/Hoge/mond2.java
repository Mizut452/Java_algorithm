package Algorythm.Hoge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mond2 {
    private int teamMemberNumber = 0;
    private int praiseNumber = 0;
    private List<String> highAndLow = new ArrayList<>();
    public static void main(String[] args) {
        Object[] values = getValues();
    }

    private static Object[] getValues() {
        Scanner sc = new Scanner(System.in);
        List<Object> values = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            values.add(sc.next());
        }

        return values.toArray(new String[values.size()]);
    }


}
