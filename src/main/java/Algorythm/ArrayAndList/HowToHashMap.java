package Algorythm.ArrayAndList;

import java.util.HashMap;
import java.util.Map;

public class HowToHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("柏レイソル", "細谷真大");
        map.put("名古屋グランパス", "キャスパー・ユンカー");
        map.put("柏レイソル", "マテウス・サヴイオ");

        System.out.println(map);
    }
}
