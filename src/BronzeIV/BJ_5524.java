package BronzeIV;

import java.util.Scanner;

public class BJ_5524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String person = sc.next();

            System.out.println(person.toLowerCase());
        }
    }
}
