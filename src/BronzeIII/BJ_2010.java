package BronzeIII;

import java.util.Scanner;

public class BJ_2010 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum - (N - 1));
    }
}
