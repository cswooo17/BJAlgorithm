package BronzeV;

import java.util.Scanner;

public class BJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stu = new int[31];

        //출석번호 입력
        for (int i = 1; i <= 28; i++) {
            int check = sc.nextInt();
            stu[check] = 1;
        }

        //미출석자 출력
        for (int i = 1; i < stu.length; i++) {
            if (stu[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
