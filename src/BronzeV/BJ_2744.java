package BronzeV;

import java.util.Scanner;

public class BJ_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";

        // 아스키코드 대문자 : 65~90 소문자 : 97~122
        // toCharArray를 사용해서 문자열을 char배열 형태로 변환한다.
        for (char c : word.toCharArray()) {
            if (c > 64 && c < 91) {
                char down = (char) ((c) + (32));
                result += down;
            } else if (c > 96 && c < 123) {
                char up = (char) ((c) - (32));
                result += up;

            }
        }
        System.out.println(result);

    }
}
