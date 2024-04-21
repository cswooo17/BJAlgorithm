package BronzeIV;

import java.util.Scanner;

public class BJ_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //시작하는 시간
        int a = sc.nextInt(); //시
        int b = sc.nextInt(); //분
        int c = sc.nextInt(); //초

        int d = sc.nextInt(); //오븐구이에 필요한 시간(초)

        c += d;      // 현재 시간에 오븐구이에 필요한 시간을 더함
        a %= 24;     // 시간을 24시간 기준으로 나눔
        b += c / 60; // 분에 초를 더하고 60으로 나눔
        a += b / 60; // 시간에 분을 더하고 60으로 나눔
        a %= 24;     // 시간을 24시간 기준으로 나눔
        b %= 60;     // 분을 60으로 나눔
        c %= 60;     // 초를 60으로 나눔

        System.out.println(a + " " + b + " " + c);
    }
}
