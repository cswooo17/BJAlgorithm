package Array;

import java.util.Scanner;

public class BJ_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (v == arr[j]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
