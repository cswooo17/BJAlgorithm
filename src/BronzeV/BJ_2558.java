package BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BJ_2558 {
    // BufferedReader를 사용할때는 IOException 예외처리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a + b);
        br.close();
    }
}
