package BronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ_2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BigInteger
        // long 타입보다 큰 숫자를 다룰 때 사용. 문자열 형태로 이루어져 있어 숫자의 범위가 무한하다.
        // java.math 클래스에 존재한다.
        // BigInteger를 사용하기 위해서는 문자값을 인자값으로 넘겨 초기화해주면 된다.
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
