package BronzeV;

import java.util.Scanner;

public class BJ_4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next(); //재환이가 말하는 길이
        String b = sc.next(); //의사가 원하는 길이

        //length : 배열의 길이를 알고자 할 때 사용
        //length() : 문자열의 길이를 알고자 할 때 사용
        //size() : ArrayList 등 Collection Framework의 길이를 알고자 할 때 사용
        if (a.length() >= b.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }

}
