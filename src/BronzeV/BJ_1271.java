package BronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ_1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger(); //최백준이 가진 돈
        BigInteger b = sc.nextBigInteger(); //돈을 받으러 온 생명체의 수

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));

    }
}
