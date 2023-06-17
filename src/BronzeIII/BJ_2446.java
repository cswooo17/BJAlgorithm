package BronzeIII;

import java.util.Scanner;

public class BJ_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (N - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


