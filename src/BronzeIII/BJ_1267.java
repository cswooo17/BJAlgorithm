package BronzeIII;

import java.util.Scanner;

public class BJ_1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //지난달에 이용한 통화 갯수
        int K; //통화 시간
        int Youngsik = 0;
        int Minsik = 0;

        for (int i = 0; i < N; i++) {
            K = sc.nextInt();
            Youngsik += ((K / 30) + 1) * 10;
            Minsik += ((K / 60) + 1) * 15;
        }
        if (Youngsik == Minsik) {
            System.out.println("Y M " + Youngsik);
        } else if (Youngsik < Minsik) {
            System.out.println("Y " + Youngsik);
        } else if (Youngsik > Minsik) {
            System.out.println("M " + Minsik);
        }
    }
}
