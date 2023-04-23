package BronzeIII;

import java.util.Scanner;

public class BJ_1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int count = 0;

            String s = sc.next();

            if (s.equals("0")) {
                System.exit(0);
            } //s의 값이 0이면 프로그램을 종료함
            for (int i = 0; i < s.length(); i++) {
                String a = s.substring(i, i + 1);// i:시작 인덱스, i+1: 반환 인덱스 (반환 인덱스에 위치한 문자열은 포함되지 않음. 따라서 i만 추출)

                if (a.equals("1")) { //
                    count += 3;
                } else if (a.equals("0")) {
                    count += 5;

                } else {
                    count += 4;
                }
            }
            System.out.println(count + 1);
        }
    }
}
