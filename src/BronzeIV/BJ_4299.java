package BronzeIV;

import java.util.Scanner;

public class BJ_4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //합
        int b = sc.nextInt(); //차
        // 짝수여부 확인 : (a + b)를 2로 나눈 나머지가 0이 아닌 경우
        // 점수의 합이 차보다 작은 경우
        // 짝수가 아니거나 차가 합보다 큰 경우 -1 출력
        if ((a + b) % 2 != 0 || a < b) {
            System.out.println(-1);
        } else {
            System.out.println(((a + b) / 2) + " " + (((a + b) / 2) - b));
        }
    }
}
