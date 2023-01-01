package BronzeIV;

import java.util.Scanner;

public class BJ_2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;
        for (int i = 0; i < 5; i++) {
            int d = sc.nextInt();
            System.out.print(d - c + " ");
        }
    }
}
