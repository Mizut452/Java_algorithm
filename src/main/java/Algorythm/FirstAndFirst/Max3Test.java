package Algorythm.FirstAndFirst;

public class Max3Test {
    static int max3(int one, int two, int three) {
        int max = one;
        if(two > max) max = two;
        if(three > max) max = three;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3, 2, 1) =" + max3(3, 2, 1));
        System.out.println("max3(3, 2, 2) =" + max3(3, 2, 2));
        System.out.println("max3(3, 1, 2) =" + max3(3, 1, 2));
        System.out.println("max3(3, 2, 3) =" + max3(3, 2, 3));
        System.out.println("max3(2, 1, 3) =" + max3(2, 1, 3));
        System.out.println("max3(3, 3, 2) =" + max3(3, 3, 2));
        System.out.println("max3(3, 3, 3) =" + max3(3, 3, 3));
        System.out.println("max3(2, 2, 3) =" + max3(2, 2, 3));
        System.out.println("max3(2, 3, 1) =" + max3(2, 3, 1));
        System.out.println("max3(2, 3, 2) =" + max3(2, 3, 2));
        System.out.println("max3(1, 3, 2) =" + max3(1, 3, 2));
        System.out.println("max3(2, 3, 3) =" + max3(2, 3, 3));
        System.out.println("max3(1, 2, 3) =" + max3(1, 2, 3));

    }
}
