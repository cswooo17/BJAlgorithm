package String;

import java.util.Scanner;
// 숫자 1을 걸려면 2초가 필요함
// 한칸 옆(2/abc)의 숫자를 걸기 위해선 1초씩 더 걸린다. -> 3초가 걸린다

public class BJ_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해준다.

            if (c <= 'C') {
                sum += 3;
            } else if (c <= 'F') {
                sum += 4;
            } else if (c <= 'I') {
                sum += 5;
            } else if (c <= 'L') {
                sum += 6;
            } else if (c <= 'O') {
                sum += 7;
            } else if (c <= 'S') {
                sum += 8;
            } else if (c <= 'V') {
                sum += 9;
            } else if (c <= 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}

