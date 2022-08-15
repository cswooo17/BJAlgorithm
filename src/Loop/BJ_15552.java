package Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BJ_15552 {
    public static void main(String[] args) throws IOException {
        //BufferedReader : 버퍼를 이용해서 읽음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter : 버퍼를 이용해서 씀
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer : 문자열을 구분자를 이용하여 분리할 때 사용
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine()); //readLine: BufferedReader에서 한줄의 텍스트를 읽음.(Strng 형태이기 때문에 Int로 형변환)
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int sum = a + b;
            bw.write(sum + "\n");//개행처리가 안되기 때문에 개행처리
        }
        br.close();
        bw.flush(); //남아있는 데이터를 모두 출력시킴
        bw.close();
    }
}
