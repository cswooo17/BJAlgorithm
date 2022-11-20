package BronzeV;

import java.util.Scanner;

public class BJ_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        System.out.println(Math.abs(N - M)); //Math.abs() : 인자값에 대한 절대값을 반환하는 함수
    }
}
