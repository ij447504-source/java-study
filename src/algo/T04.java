package algo;
//12와 6의 최대공약수 구하기_미완성
public class T04 {
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
