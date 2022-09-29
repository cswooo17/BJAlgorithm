package String;

import java.util.Scanner;

public class BJ_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        char[] c;

        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            c = sc.next().toCharArray();// toCharArray: 입력한 문자열을 char형 배열로 바꿔줌

            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }


    }
}
