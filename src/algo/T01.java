package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오.
 * (1) 비즈니스 2,4,6,8,10
 * (2) 샘플링 (1~10)
 * (3) 노가다 System.out.println(2);
 * (4) 패턴
 */
public class T01 {
    public static void main(String[] args) {
        int n =1;
        String result = "아닙니다";


        //num=1
        if(n%2==0){
            result="배수가 맞습니다.";
        }else{
            result="배수가 아닙니다";
        }
        System.out.println(n+"은 2의 "+result);
        n++;

        //num=2
        if(n%2==0){
            result="배수가 맞습니다.";
        }else{
            result="배수가 아닙니다";
        }
        System.out.println(n+"은 2의 "+result);
        n++;

        //num=3
        if(n%2==0){
            result="배수가 맞습니다.";
        }else{
            result="배수가 아닙니다";
        }
        System.out.println(n+"은 2의 "+result);
        n++;

        //num=4
        if(n%2==0){
            result="배수가 맞습니다.";
        }else{
            result="배수가 아닙니다";
        }
        System.out.println(n+"은 2의 "+result);
        n++;

        //num=5
        if(n%2==0){
            result="배수가 맞습니다.";
        }else{
            result="배수가 아닙니다";
        }
        System.out.println(n+"은 2의 "+result);
        n++;
    }
}

