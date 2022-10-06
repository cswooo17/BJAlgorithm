package String;

import java.util.Scanner;

public class BJ_2908_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Reverse(sc.nextInt());
        int b = Reverse(sc.nextInt());

        System.out.println(a > b ? a : b);
    }

    //Reverse 함수 생성
    static int Reverse(int num) { // static : 정적 변수
        String number = String.valueOf(num);//valueOf : 파라미터가 null이면 문자열 null을 반환한다. (toString은 NPE 발생)
        String tmp = "0";

        for (int i = 3; i > 0; i--) {
            tmp += number.charAt(i - 1);
        }
        return Integer.parseInt(tmp);
    }

}
