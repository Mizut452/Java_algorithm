package Algorythm.ArrayAndList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        //チーム名と選手のマッピング
        List<String> frontaleList = new ArrayList<>();
        frontaleList.add("上福元");
        frontaleList.add("大島僚太");
        frontaleList.add("家長昭博");
        frontaleList.add("レアンドロ・ダミアン");
        frontaleList.add("シミッチ");
        frontaleList.add("チョンソンリョン");
        HashMap<String,List<String>> teamMap = new HashMap<>();
        teamMap.put("川崎フロンターレ", frontaleList);
        System.out.println(teamMap);
    }
}
