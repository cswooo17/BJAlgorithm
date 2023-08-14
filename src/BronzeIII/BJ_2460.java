package BronzeIII;

import java.util.Scanner;

public class BJ_2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int output = sc.nextInt();
            int input = sc.nextInt();
            count -= output; //내린 사람 수를 count에서 뺀다.
            count += input; //탄 사람 수를 count에 더한다.
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
