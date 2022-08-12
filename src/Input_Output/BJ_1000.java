package Input_Output;

import java.util.Scanner;

public class BJ_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키보드에서 사용자의 입력값을 받기 위해 System.in 사용

        int a = sc.nextInt(); // 입력값이 1이므로 nextInt 사용. 입력받은 값을 int로 변환한다.
        int b = sc.nextInt(); // 입력값이 2이므로 nextInt 사용. 입력받은 값을 int로 변환한다.

        System.out.println(a+b);

        sc.close(); //Scanner 클래스 사용 종료


    }
}
