public class BJ_10172_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder : String과 문자열을 더할 때 새로운 객체를 생성하는것이 아니라 기존의 데이터에 더하는 방식을 사용하기 때문에 속도가 빠르고 부하가 적다.
        StringBuilder sb = new StringBuilder();

        //append : 문자열을 더하는 역할을 한다.
        sb.append("|\\_/|\n"); // \n을 사용하여 개행처리
        sb.append("|q p|   /}\n");
        sb.append("( 0 )\"\"\"\\\n");
        sb.append("|\"^\"`    |\n");
        sb.append("||_/=\\\\__|");

        System.out.println(sb);
    }
}
