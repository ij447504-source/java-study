package ex02;

public class FtoC2 {
    public static void main(String[] args) {
        //1. 화씨온도 받기(캐나다에서 쓰는 온도 F)
        double f= 100.0;
        //System.out.println(f);

        // 2. 섭씨온도로 변경하기
        double c = 5.0/9 * (f-32); //8byte의 공간을 c에 확보해
        //무엇이 잘못됐는지 분리해서 검수
        //System.out.println(f-32); // f는 double, 32는 int, 묵시적  결과값 68.0
        //System.out.println(5/9); //int 5, int 9 로 인하여 결과값 0 추출
        // 0* 68.0, 68.0로 인해 더블> 묵시적
        //System.out.println(5/9.0);

        //3. 출력해서 섭씨온도 확인하기 (37.7777)
        System.out.println("섭씨온도는"+c);

    }
}
