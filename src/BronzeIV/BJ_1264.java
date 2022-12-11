package BronzeIV;

import java.util.Scanner;

public class BJ_1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            int n = 0;

            if (str.equals("#")) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                char t = str.charAt(i);
                if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                    t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U') {
                    n++;
                }
            }
            System.out.println(n);
        }
    }


}
