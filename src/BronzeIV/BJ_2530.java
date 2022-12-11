package BronzeIV;

import java.util.Scanner;

public class BJ_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //시작하는 시간
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //오븐구이에 필요한 시간
        int d = sc.nextInt();

        c += d;
        a %= 24;
        b += c / 60;
        a += b / 60;
        a %= 24;
        b %= 60;
        c %= 60;

        System.out.println(a + " " + b + " " + c);

    }
}
