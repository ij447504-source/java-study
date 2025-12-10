package algo;

import java.util.Random;
// 로또만들어보기
public class LottoApp {
    public static void main(String[] args) {
        int[] arr = new int[6];//정수 6개를 저장할 수 있는 배열 공간을 만들어라

        Random r = new Random();

        //1~45의 사이 숫자를 랜덤으로해서 n에 저장하라
        //nextInt() : 다음(next) 정수(int)를 랜덤으로 주세요
        int n = r.nextInt(45) + 1; // 5
        arr[0] = n;

        int n2 = r.nextInt(45) + 1;
        int n3 = r.nextInt(45) + 1;
        int n4 = r.nextInt(45) + 1;
        int n5 = r.nextInt(45) + 1;
        int n6 = r.nextInt(45) + 1;


        System.out.println(n);
        //정수값 1개 출력

        // 직전에 나온 값들과 중복되지 않으면 출력을 해주세요
        //비교문 다시 만들기
//        if (n2 != n) {
//            System.out.println("n2의 값은 " + n2 + "입니다.");
//        } else System.out.println(n2);
//        if (n2 != n && n3 != n ) {
//            System.out.println("n3의 값은 " + n3 + "입니다.");
//        } else System.out.println(n3);
//        if (n2 != n && n3 != n && n4 != n) {
//            System.out.println("n4의 값은 " + n4 + "입니다.");
//        } else System.out.println(n4);
//        if (n2 != n && n3 != n && n4 != n && n5 != n) {
//            System.out.println("n5의 값은 " + n5 + "입니다.");
//        } else System.out.println(n5);
//        if (n2 != n && n3 != n && n4 != n && n5 != n && n6 != n) {
//            System.out.println("n6의 값은 " + n6 + "입니다.");
//        } else System.out.println(n6);

        //값이 같다면 추출하지 않고 아니라면 돌려라




            //[1,5,5,12,13,35]_정수 6개
//        arr[0] = 1
//        arr[1] = 5
//        arr[2] = 5
//        arr[3] = 12
//        arr[4] = 13
//        arr[5] = 35

            //while을 이용하여 중복되지 않도록 짜기

        }
    }
