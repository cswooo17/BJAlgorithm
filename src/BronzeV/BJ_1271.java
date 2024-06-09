package BronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ_1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger(); //최백준이 가진 돈
        BigInteger m = sc.nextBigInteger(); //돈을 받으러 온 생명체의 수

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
        //문제에서 1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수라고 명시했기 때문에 int는 사용할 수 없다.
    }
}
