package String;

import java.util.Scanner;

public class BJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String a = sc.next();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += a.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}