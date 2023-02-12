package BronzeIV;

import java.util.Scanner;

public class BJ_5717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int male = sc.nextInt();
            int female = sc.nextInt();
            if (male == 0 && female == 0) {
                break;
            }
            System.out.println(male + female);
        }
    }
}
