package String;

import java.util.Scanner;

public class BJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 알파벳 A-Z 는 26개이기때문에 26크기의 배열 선언
        int alphabet[] = new int[26];

        // 데이터를 입력 할 때 대문자로 변환해서 입력
        String str = sc.next().toUpperCase();

        // 입력한 문자열 길이만큼 반복문 실행
        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 65]++;
        }

        int max = 0;
        int ans = 0;
        for (int i = 0; i < alphabet.length; i++) {
            // 현재 인덱스의 값과 저장된 가장 자주 나온 값과 비교. (가장 많이 사용된 알파벳 조건문을 찾는다)
            if (max < alphabet[i]) {
                max = alphabet[i];
                ans = i;

            // 현재 인덱스에 저장된 값과 가장 자주 나온 값이 같은지 확인. (최빈값이 2 이상이면 "?"를 출력한다.)
            } else if (max == alphabet[i]) {
                ans = -2;// 아스키코드에서 "?"는 A(65)보다 2가 작다.
            }
        }
        //결과값 출력 (가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.)
        System.out.printf("%s", Character.toString(ans + 65));
    }

}
