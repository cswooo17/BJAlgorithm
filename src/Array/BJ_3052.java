package Array;

import java.util.Scanner;

public class BJ_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        boolean bl; //참거짓 구분
        int count = 0; // 서로 다른 수 count

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        //입력된 2개의 값이 다른 값인지 판단
        for (int i = 0; i < arr.length; i++) {
            bl = false; //false를 기본값으로 지정
            for (int j = i + 1; j < arr.length; j++) {
                //비교해서 true 이면 break;
                if (arr[i] == arr[j]) {
                    bl = true;
                    break;
                }
            }
            if (!bl) {
                count++;
            }
        }
        System.out.println(count);
    }
}

