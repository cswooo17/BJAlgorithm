package BronzeIV;

import java.util.Scanner;

public class BJ_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu[] = new int[5];
        for (int i = 0; i < 5; i++) {
            menu[i] = sc.nextInt();
        }
        int burger = menu[0];
        int drink = menu[3];
        for (int i = 0; i < 3; i++) {
            //버거
            if (burger > menu[i]) {
                burger = menu[i];
            }
        }
        for (int i = 3; i < 5; i++) {
            //음료
            if (drink > menu[i]) {
                drink = menu[i];
            }
        }
        //가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
        System.out.println(burger + drink - 50);

    }
}
