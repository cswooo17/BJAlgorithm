package String;

import java.util.Scanner;

public class BJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alphabet[] = new int[26];
        String str = sc.next().toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 65]++;

        }

        int max = 0;
        int ans = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
                ans = i;
            } else if (max == alphabet[i]) {
                ans = -2;
            }
        }
        System.out.printf("%s", Character.toString(ans + 'A'));
    }

}
