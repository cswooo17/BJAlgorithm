package Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1000_BufferedReader {
    //BufferedReader를 사용할 때는 입출력 예외처리를 꼭 해준다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()); //readLine 메소드의 입력값은 String이기 때문에 숫자 입력 시 형변환은 필수이다.
        int b = Integer.parseInt(br.readLine());

        System.out.println(a+b);

    }
}
