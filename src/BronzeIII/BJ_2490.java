package BronzeIII;

import java.util.Scanner;

public class BJ_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            int frontCnt = 0;
            for (int j = 0; j < 4; j++) {
                int input = sc.nextInt();
                if (input == 0) {
                    frontCnt++;
                }
            }

            // 윷의 앞면 개수에 따라 결과 출력
            if (frontCnt == 1) {
                System.out.println("A");
            } else if (frontCnt == 2) {
                System.out.println("B");
            } else if (frontCnt == 3) {
                System.out.println("C");
            } else if (frontCnt == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }

        }
        sc.close();
    }
}
