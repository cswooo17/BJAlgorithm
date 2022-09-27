package String;

import java.util.Scanner;

public class BJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch - 97] == -1) {
                arr[ch - 97] = i;
            }
        }

        for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[c] + " ");
        }
    }
}
