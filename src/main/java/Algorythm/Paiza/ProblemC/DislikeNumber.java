package Algorythm.Paiza.ProblemC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DislikeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dislikeNum = 4;
        int hospitalRoom = 5;
        List<Integer> dislikeRoomList = new ArrayList<>();
        for (int i = 0; i < hospitalRoom; i++) {
            String roomNum = sc.next();
            for (int j = 0; j < roomNum.length(); j++) {
                int roomChar = roomNum.charAt(j) - 48;
                if(roomChar == dislikeNum) {
                    dislikeRoomList.add(Integer.parseInt(roomNum));
                    break;
                }
            }
        }
        for(int dislikeRoom : dislikeRoomList) {
            System.out.println(dislikeRoom);
        }
    }
}
