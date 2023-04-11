package Algorythm.FirstAndFirst;

public class Practice1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        //４つの中で一番大きな数字を返すメソッド
        System.out.println("max4(1, 2, 3, 4) =" + max4(1, 2, 3, 4));
        System.out.println("max4(2, 5, 10, 20) =" + max4(2, 5, 10, 20));
        System.out.println("max4(20, 1, 0, 3) =" + max4(20, 1, 0, 3));
        System.out.println("max4(10, 10, 3, 10) =" + max4(10, 10, 3, 10));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //４つの中で一番小さな数字を返すメソッド
        System.out.println("min4(10, 20, 30, 20) =" + min4(10, 20, 30, 20));
        System.out.println("min4(100, 20, 20, 20) =" + min4(100, 20, 20, 20));
        System.out.println("min4(5, 4, 5, 2) =" + min4(5, 4, 5, 2));
        System.out.println("min4(1, 2, 3, 4) =" + min4(1, 2, 3, 4));
        System.out.println("min4(10, 9, 8, 1) =" + min4(10, 9, 8, 1));
    }
}
