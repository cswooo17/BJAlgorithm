package BronzeV;

import java.util.Scanner;

public class BJ_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //결과값이 int범위를 초과하기 때문에 long으로 선언
        long N = sc.nextLong();
        long M = sc.nextLong();

        System.out.println(Math.abs(N - M)); //Math.abs() : 인자값에 대한 절대값을 반환하는 함수
    }
}
