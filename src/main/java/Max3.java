import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("３つの整数の最大値を求めます。");

        System.out.println("１つ目の値："); int one = sc.nextInt();
        System.out.println("２つ目の値："); int second = sc.nextInt();
        System.out.println("３つ目の値："); int third = sc.nextInt();

        int max = one;
        if (second > max) max = second;
        if (third > max) max = third;

        System.out.println("最大値は" + max + "です");
    }
}
