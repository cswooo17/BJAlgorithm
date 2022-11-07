package Array;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //a에 입력한 숫자 크기만큼의 배열 생성
        int a = sc.nextInt();
        int[] b = new int[a];

        //배열 크기만큼 자연수 입력
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        //배열 b를 IntStearm형태로 만든다
        //IntStream : int 타입의 스트림
        IntStream intStream = Arrays.stream(b);

        //OptionalInt에 intStream의 max값을 저장한다
        OptionalInt optionalInt = intStream.max();
        int maxAsInt = optionalInt.getAsInt();//getAsInt : int 값을 반환한다. 단 max값이 없는 경우 NoSuchElementException 예외가 발생할 수 있다.
        int index = 0;

        // 최대값의 인덱스 구하기
        for (int i = 0; i < b.length; i++) {
            //배열값이 maxAsInt보다 큰 경우 index에 배열의 위치를 저장한다.
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
