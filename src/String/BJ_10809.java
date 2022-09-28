package String;

import java.util.Scanner;

public class BJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int형 배열 생성
        int[] arr = new int[26];

        //배열을 모두 -1로 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        //데이터 입력
        String s = sc.nextLine();

        //for문을 통해 데이터 검증
        for (int i = 0; i < s.length(); i++) {
            //charAt() : 입력한 문자열을 char타입으로 한글자만 받는다.
            char ch = s.charAt(i);

            // 중복되는 문자는 arr에 값으로 들어갈 수 없으므로 arr 원소 값이 -1인 경우에만 초기화
            // 97 = 아스키코드의 소문자 a
            if (arr[ch - 97] == -1) {
                arr[ch - 97] = i;
            }
        }

        for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[c] + " ");
        }
    }
}
