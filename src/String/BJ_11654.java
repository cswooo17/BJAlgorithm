package String;

import java.util.Scanner;

public class BJ_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char Character = input.charAt(0); //chatAt() : String으로 저장된 문자열 중 한글자만 선택해서 char타입으로 변환해줌
        int ascii = (int) Character;

        System.out.println(ascii);


    }
}
