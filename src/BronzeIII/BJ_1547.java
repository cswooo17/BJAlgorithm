package BronzeIII;

import java.util.Scanner;

public class BJ_1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int cup = 1;
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (cup == X) {
                cup = Y;
            } else if (cup == Y) {
                cup = X;
            }
        }
        System.out.println(cup);
    }
}

