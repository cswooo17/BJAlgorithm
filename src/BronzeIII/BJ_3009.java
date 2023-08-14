package BronzeIII;

import java.util.Scanner;

public class BJ_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {sc.nextInt(), sc.nextInt()}; //5 5
        int[] b = {sc.nextInt(), sc.nextInt()}; //5 7
        int[] c = {sc.nextInt(), sc.nextInt()}; //7 5

        int x;
        int y;

        //x좌표 비교
        if (a[0] == b[0]) {
            x = c[0];
        } else if (a[0] == c[0]) {
            x = b[0];
        } else {
            x = a[0];
        }

        //y좌표 비교
        if (a[1] == b[1]) {
            y = c[1];
        } else if (a[1] == c[1]) {
            y = b[1];
        } else {
            y = a[1];
        }
        System.out.println(x + " " + y);
    }
}
