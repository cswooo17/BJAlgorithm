package BronzeIII;

import java.util.Scanner;

public class BJ_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 위쪽 반쪽 다이아몬드 출력
        for (int i = 0; i < N; i++) {
            // 왼쪽 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별(*) 출력
            for (int k = 0; k < 2 * (N - i) - 1; k++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }

        // 아래쪽 반쪽 다이아몬드 출력
        for (int i = 1; i < N; i++) {
            // 왼쪽 공백 출력
            for (int j = 1; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별(*) 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                 System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}
