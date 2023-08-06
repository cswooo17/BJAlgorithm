package BronzeIII;

import java.util.Scanner;


public class BJ_2721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int k = 0; k < T; k++) {
            int w = sc.nextInt();
            int tot = 0;
            for (int j = 1; j <= w; j++) {
                tot += j * (j + 1) * (j + 2) / 2;
            }
            System.out.println(tot);
        }
    }
}
