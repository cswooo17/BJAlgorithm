package Conditional_Statement;

import java.util.Scanner;

public class BJ_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //같은 눈이 3개가 나오는 경우
        if(a == b && a == c && b == c){
            System.out.println(10000 + a * 1000);
        //같은 눈이 2개만 나오는 경우
        }else if(a == b || a == c){
            System.out.println(1000 + a * 100);
        }else if (b == c) {
            System.out.println(1000 + b * 100);
        //모두 다른 눈이 나오는 경우
        }else{
            System.out.println((Math.max(a, Math.max(b, c)) * 100));
        }
    }
}
