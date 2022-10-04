package String;

import java.util.Scanner;

public class BJ_2908_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Reverse(sc.nextInt());
        int b = Reverse(sc.nextInt());

        // if문을 썼지만 삼항 연산자를 써줘도 된다.
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        }
    }

    //Reverse 함수 생성
    static int Reverse(int num) { // static : 정적 변수
        String number = String.valueOf(num);
        String tmp = "0";

        for (int i = 3; i > 0; i--) {
            tmp += number.charAt(i - 1);
        }
        return Integer.parseInt(tmp);
    }

}
