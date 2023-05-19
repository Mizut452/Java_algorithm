package Algorythm.ArrayAndList;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        String[][] strArray = new String[3][3];

        intArray[0] = 3;
        intArray[1] = 2;
        intArray[2] = 5;
        intArray[3] = 12;
        intArray[4] = 200;

        strArray[0][0] = "岩尾憲";
        strArray[0][1] = "伊藤敦樹";
        strArray[0][2] = "小泉佳穂";
        strArray[1][0] = "豆山寅太郎";
        //nullにする
        strArray[1][0] = null;
        strArray[1][0] = "鳥海晃司";
        strArray[1][1] = "為田大貴";
        strArray[1][2] = "レオセアラ";
        strArray[2][0] = "水沼宏太";
        strArray[2][1] = "喜田拓也";
        strArray[2][2] = "シュワルツェネッガー";
        //上書きする
        strArray[2][2] = "西村拓真";


        //1次元配列の出力
        System.out.println("1次元配列の出力：" + Arrays.toString(intArray));
        //1次元配列の要素を1つずつ出力する
        for(int index : intArray) {
            System.out.println("1次元配列の要素：" + index);
        }
        //2次元配列の出力
        System.out.println("2次元配列の出力" + Arrays.deepToString(strArray));

        //1次元配列のランダムアクセス
        System.out.println(intArray[1]);

        //2次元配列のランダムアクセス
        System.out.println("セレッソの9番は" + strArray[1][2]);

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                System.out.println(strArray[i][j]);
            }
        }

        for (String[] word : strArray) {
            for(String wotd : word) {
                System.out.println("拡張" + wotd);
            }
        }
    }
}
