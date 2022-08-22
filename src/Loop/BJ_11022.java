package Loop;

import java.util.Scanner;

public class BJ_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 1; i<=input; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
        }
        sc.close();
    }
}
