package Loop;

import java.util.Scanner;

public class BJ_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt(); //영수증에 적힌 총금액
        int count = sc.nextInt(); //영수증에 적힌 구매한 물건의 종류의 수

        for(int i = 0; i < count; i++){
            int price = sc.nextInt(); //물건의 가격
            int num = sc.nextInt(); //개수

            total = total - (price * num);

        }

        if (total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
