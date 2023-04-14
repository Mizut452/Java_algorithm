package Algorythm.Hoge;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StrTest {
    public static void main(String[] args) {
        Integer[] values = getValues();
        int bossHP = values[0];
        int playerDamage = values[1];
        int bossHeal = values[2];

        //倒すことができるかの判定
        if(bossHP > playerDamage) {
            int turnPoint;
            if (playerDamage > bossHeal) {
                for (turnPoint = 0; bossHP > 0; turnPoint++) {
                    bossHP -= playerDamage;
                    if (bossHP < 0) {
                        turnPoint++;
                        break;
                    }
                    bossHP += bossHeal;
                }
                System.out.println("YES");
                System.out.println(turnPoint);
            //一発で倒せないかつボスの回復量がプレイヤーのダメージ量以上の時は倒せない
            } else {
                System.out.println("No");
            }

        } else {
            System.out.println("YES");
            System.out.println(1);
        }
    }

    private static Integer[] getValues() {
        Scanner sc = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            values.add(sc.nextInt());
        }
        return values.toArray(new Integer[3]);
    }
}

