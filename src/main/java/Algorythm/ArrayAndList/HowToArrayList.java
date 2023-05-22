package Algorythm.ArrayAndList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowToArrayList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("如月");
        strList.add(0, "睦月");
        strList.add("睦月");
        System.out.println(strList);
        System.out.println(strList.indexOf("如月"));
        System.out.println(strList.indexOf("さむらい"));
        System.out.println(strList.subList(0, 2));
        System.out.println("きのこ" + strList.get(strList.indexOf("如月")));
        System.out.println("きのこ" + strList.get(strList.indexOf("まめ")));

        List<String> delete = new ArrayList<>();
        Collections.addAll(delete, "睦月");
        strList.removeAll(delete);
        System.out.println(strList);
    }
}
