package Conditional_Statement;

import java.util.Scanner;

public class BJ_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        if(minute<45){
            hour--;
            minute = 60 - (45-minute);

            if(hour<0){
                hour=23;
            }
            System.out.println(hour + " " + minute);
        }else{
            System.out.println(hour + " " + (minute-45));
        }

    }
}
