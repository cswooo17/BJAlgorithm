package BronzeIII;

import java.util.Scanner;

/**
 * Greedy Algorithm
 */
public class BJ_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수를 입력 받음

        for (int i = 0; i < T; i++) { // 각 테스트 케이스에 대해 반복
            int money = sc.nextInt(); // 세탁비용을 입력 받음

            int Quarter = money / 25; // 25센트 동전의 개수를 계산
            money = money % 25; // 25센트 동전으로 교환하고 남은 잔액을 계산

            int Dime = money / 10; // 10센트 동전의 개수를 계산
            money = money % 10; // 10센트 동전으로 교환하고 남은 잔액을 계산

            int Nickel = money / 5; // 5센트 동전의 개수를 계산
            money = money % 5; // 5센트 동전으로 교환하고 남은 잔액을 계산

            int Penny = money; // 1센트 동전의 개수를 계산

            // 각 테스트 케이스별로 25센트, 10센트, 5센트, 1센트 동전의 개수를 출력
            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
        }
    }
}
