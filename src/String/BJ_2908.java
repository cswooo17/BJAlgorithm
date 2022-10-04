package String;

import java.util.Scanner;

public class BJ_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString()); // .reverse() 를 사용해 문자열을 뒤집는다.
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        }
    }

}

