package String;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        String[] word = new String[n];
        boolean wordCheck[] = new boolean[26]; //단어 체크 배열 생성

        for (int i = 0; i < n; i++) {
            word[i] = sc.next();

        }

        for (int i = 0; i < word.length; i++) {
            cnt++;
            Arrays.fill(wordCheck, false); // 배열의 모든 값을 false로 초기화한다.
            for (int j = 0; j < word[i].length(); j++) {
                if (j != word[i].length() - 1 && wordCheck[word[i].charAt(j) - 97] == false && word[i].charAt(j) != word[i].charAt(j + 1)) {
                    wordCheck[word[i].charAt(j) - 97] = true;
                } else if (wordCheck[word[i].charAt(j) - 97] == true) {
                    cnt -= 1;
                    break;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
