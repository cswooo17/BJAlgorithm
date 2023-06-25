package BronzeIII;

import java.util.Scanner;

public class BJ_2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxPeople = 0;
        int currentPeople = 0;
        for (int i = 1; i <= 4; i++) {
            int output = sc.nextInt();
            int intput = sc.nextInt();
            currentPeople = currentPeople - output + intput;

            maxPeople = Math.max(maxPeople, currentPeople);

        }
        System.out.println(maxPeople);
    }
}
