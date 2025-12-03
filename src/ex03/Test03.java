package ex03;
//1부터 10까지 더해서 합을 출력하는 프로그램을 만드시오(힌트 int sum =0;변수 만들어서 누적하기)
public class Test03 {
    public static void main(String[] args) {
        int sum=0;


        // 내가 작성한 값
        for (int i=1; i<=10; i++)
            sum += i;

            System.out.println(sum); //누적값만들기

        //강사님 풀이1 ) 누적 sum++(1씩밖에 증가못함), sum=sum+1)
        for (int j=1; j<11; j++) {
            sum = sum + j;
        }
        System.out.println(sum);


//        //강사님 풀이2
//        int sum=0;
//        int n = 5; //1~5
//        //식
//        sum=(n+1)*(n/2);
//        System.out.println(sum);  //결과값 : 55

    }
}





