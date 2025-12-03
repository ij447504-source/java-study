package algo;
//두 수의 최대공약수 구하기(도전)

/**
 * (1) 12의 약수 [1,2,3,4,6,12] 배열에 담기
 * (2) 6의 약수 [1,2,3,6] 배열에 담기
 * (3) 두수의 최대 공약수 구하기 6 (배열을 비교해야함)-
 * 최대 공약수 : 공통으로 있는 약수 중 가장 큰 수인 6
 */
public class T03 {
    public static void main(String[] args) {
        int n=1;
        int n2=1;
        String result="맞습니다.";

        //
        for (int i = 0; i < 12; i++) {
            if(12%n==0){
                result="약수가 맞습니다";
            }else {
                result="약수가 아닙니다";
            }
            System.out.println(n+"은 12의 "+result);
            n++;
        }



        for (int i = 0; i < 6; i++) {
            if(6%n2==0){
                result="약수가 맞습니다";
            }else {
                result="약수가 아닙니다";
            }
            System.out.println(n2+"은 6의 "+result);
            n2++;
        }




    }
}
