package Array;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        IntStream intStream = Arrays.stream(b);
        OptionalInt optionalInt = intStream.max();
        int maxAsInt = optionalInt.getAsInt();
        int index = 0;

        // 최대값의 인덱스 구하기
        for (int i = 0; i < b.length; i++) {
            if (b[i] > maxAsInt) {
                maxAsInt = b[i];
                index = i;
            }
        }

        sc.close();

        System.out.println(maxAsInt); // max값 출력
        System.out.println(index); // 배열의 위치 출력

    }
}
