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
            Arrays.fill(wordCheck, false); // 배열의 모든 값을 false로 초기화한다. Arrays.fill은 Java11부터 사용 가능
            for (int j = 0; j < word[i].length(); j++) {
                //단어의 마지막 숫자가 아니거나, 등장하지 않았던 알파벳이거나, j의 다음 알파벳과 일치하지 않으면
                if (j != word[i].length() - 1 && wordCheck[word[i].charAt(j) - 97] == false && word[i].charAt(j) != word[i].charAt(j + 1)) {
                    //해당 알파벳의 그룹은 끝이므로 true 반환
                    wordCheck[word[i].charAt(j) - 97] = true;
                } else if (wordCheck[word[i].charAt(j) - 97] == true) { //이미 한 번 등장했던 알파벳이라면
                    cnt -= 1; //그룹 단어가 아니므로
                    break; // break로 빠져나온다.
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
