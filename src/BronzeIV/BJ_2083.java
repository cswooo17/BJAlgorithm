package BronzeIV;

import java.util.Scanner;

public class BJ_2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위해 Scanner 객체를 생성

        while (true) { // 무한 루프 시작
            String name = sc.next(); // 이름 입력받기
            int age = sc.nextInt(); // 나이 입력받기
            int weight = sc.nextInt(); // 몸무게 입력받기

            // 이름이 "#"이고 나이가 0이며 몸무게가 0이면 루프 종료
            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            // 나이가 17세보다 많거나 몸무게가 80kg 이상이면 "Senior" 출력
            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else { // 그 외에는 "Junior" 출력
                System.out.println(name + " Junior");
            }
        }
    }
}
