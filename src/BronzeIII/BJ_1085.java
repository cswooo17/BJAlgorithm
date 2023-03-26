package BronzeIII;

import java.util.Scanner;

public class BJ_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int z = sc.nextInt();

        int x_min = Math.min(x, (w - x));
        int y_min = Math.min(y, (z - y));

        System.out.println(Math.min(x_min, y_min));
    }
}
