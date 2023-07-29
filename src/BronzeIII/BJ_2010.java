package BronzeIII;

import java.util.Scanner;

public class BJ_2010 {
    public static void main(String[] args) {
        int sum = 0; // 플러그의 총 개수를 저장하는 변수 sum을 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력받을 플러그의 개수 2

        for (int i = 0; i < N; i++) { // 0 1
            int num = sc.nextInt(); // 플러그 하나의 정보를 입력받음
            sum += num; // 플러그 하나를 사용하고 남은 자리를 더함
        }

        // 모든 플러그를 연결한 경우, 사용한 플러그의 개수는 (총 플러그의 개수 - 1)개
        // 총 플러그의 개수에서 1을 빼면 사용한 플러그의 개수가 나옴
        System.out.println(sum - (N - 1));
    }
}
