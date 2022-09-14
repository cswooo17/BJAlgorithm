package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //n만큼의 배열 생성
        int n = sc.nextInt();
        int[] numbers = new int[n];

        //배열 크기 만큼의 숫자 입력
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        //배열을 오름차순 정렬하여 최소값과 최대값 나열 후 출력
        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " + numbers[numbers.length - 1]);

    }
}
