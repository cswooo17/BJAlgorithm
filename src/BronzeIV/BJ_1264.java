package BronzeIV;

import java.util.Scanner;

public class BJ_1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체를 생성하여 사용자 입력을 받기 위해 사용

        while (true) { // 무한 루프 시작
            String str = sc.nextLine(); // 사용자 입력을 한 줄씩 받음
            int n = 0; // 모음의 개수를 저장할 변수 초기화

            if (str.equals("#")) { // 입력이 "#"인 경우 루프를 종료
                break;
            }
            for (int i = 0; i < str.length(); i++) { // 입력 문자열의 길이만큼 반복
                char t = str.charAt(i); // 문자열의 각 문자를 하나씩 가져옴
                if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || // 소문자 모음 확인
                    t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U') { // 대문자 모음 확인
                    n++; // 모음인 경우 카운트 증가
                }
            }
            System.out.println(n); // 모음의 개수 출력
        }
    }
}
