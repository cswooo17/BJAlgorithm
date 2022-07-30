import java.util.Scanner;

public class BJ_10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a값을 입력하세요");
        int a = sc.nextInt();
        System.out.println("b값을 입력하세요");
        int b = sc.nextInt();
        System.out.println("a * b 값이 출력됩니다.");
        System.out.println(a*b);

        sc.close();
    }
}
