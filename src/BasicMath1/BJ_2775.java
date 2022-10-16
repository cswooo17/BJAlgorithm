package BasicMath1;

import java.util.Scanner;

public class BJ_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int T = sc.nextInt(); //TastCase T
        int[] people = new int[15]; // 한 층에 사는 사람들의 수

        // TestCase T 만큼 반복
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < people.length; i++) {
                people[i] = i;
            }
            int k = sc.nextInt();
            int n = sc.nextInt();

            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    people[j] += people[j - 1];
                }
            }
            sb.append(people[n] + "\n"); // append : 문자열의 마지막에 이어 붙이는 메소드
        }
        System.out.println(sb);
    }
}
