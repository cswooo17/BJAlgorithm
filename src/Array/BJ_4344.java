package Array;

import java.util.Scanner;

public class BJ_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //배열 선언
        int[] arr;
        //테스트케이스 C 선언
        int C = sc.nextInt();


        for (int i = 0; i < C; i++) {
            //학생 수 입력
            int n = sc.nextInt();
            //학생 수 만큼의 크기를 가진 배열 생성
            arr = new int[n];

            //합계 초기화
            double sum = 0;

            //점수 입력
            for (int j = 0; j < n; j++) {
                int score = sc.nextInt();
                arr[j] = score;

                //입력된 점수 sum
                sum += score;
            }

            //평균값
            double avg = sum / n;
            double count = 0;

            for (int k = 0; k < n; k++) {
                //arr[k]가 평균값보다 큰 경우 count증가
                if (arr[k] > avg) {
                    count++;
                }
            }
            double result = (count / n) * 100;
            String lastpang = String.format("%.3f%%", result);
            System.out.println(lastpang);
        }
        sc.close();
    }
}
