package algo;

/**
 * 12의 약수를 출력하시오!
 * (1) 비즈니스 이해(12를 1부터~12까지 다 나눠서 나누어떨어지면 약수/예로 ) 결과값 1,2,3,4,6,12
 * (2) 샘플링 6의 약수 구하기
 * (3) 노가다
 * (4) 패턴찾기
 */
public class Divisor01 {
    public static void main(String[] args) {

        int n =1;
        String result = "맞습니다.";


        for (int i = 0; i < 12; i++) {
            if(12%n==0) {
                result = "약수가 맞습니다.";
            }else{
                result="약수가 아닙니다.";
            }
            System.out.println(n+"은 "+result);
            n++;
        }



    }
}
