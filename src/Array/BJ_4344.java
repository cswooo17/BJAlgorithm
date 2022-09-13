package Array;

import java.util.Scanner;

public class BJ_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;
        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            double sum = 0;

            for (int j = 0; j < n; j++) {
                int score = sc.nextInt();
                arr[j] = score;

                sum += score;
            }

            double avg = sum / n;
            double count = 0;

            for (int k = 0; k < n; k++) {
                if (arr[k] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / n) * 100);

        }
        sc.close();
    }
}
