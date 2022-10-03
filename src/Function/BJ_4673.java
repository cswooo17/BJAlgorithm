package Function;

//d(n) 함수 작성
//d(n) 함수를 이용하여 셀프넘버와 아닌 함수를 구분
//셀프넘버인 수 출력

public class BJ_4673 {

    //d(n)함수 생성
    //입력된 수를 sum에 저장 한 후 0이 나올때까지 while문 실행
    static int d(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10; //number의 첫째 자리 수 계산
            number = number / 10; //나누기로 첫째자리 수 제외

        }
        return sum;
    }

    public static void main(String[] args) {

        //d(n) 함수를 이용해서 셀프넘버와 아닌 함수 구분
        boolean[] a = new boolean[10001];

        for (int i = 0; i < a.length; i++) {
            int n = d(i);
            if (n < 10001) {
                a[n] = true;
            }
        }
        //셀프넘버인 수 출력
        for (int i = 1; i < 10001; i++) { // 1부터 10000까지 for문을 실행시켜서 false만 출력한다.
            if (a[i] == false) {
                System.out.println(i);
            }
        }
    }
}

