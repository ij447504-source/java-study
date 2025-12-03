package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨온도를 입력하시오: ");

        double f = sc.nextDouble(); //사용자가 입력한 값 중 실수(예: 3.14, 10.5, -2.0 같은 숫자) 하나를 가져와서 프로그램이 사용할 수 있게 함
        double result = (5.0/9.0) *(f-32);  //기존 5/9로 적용하면 int로 적용되기 때문에 0.5가 아닌 0이 나옴 그래서 어떤 온도를 넣어도 결과값 0
        // 그래서 5/9 > (5.0/9.0)으로 수정

        System.out.println("섭씨 온도는 "+result);
    }
}
