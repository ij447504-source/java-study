package ex03;
//별 5개부터1개추출해줭 그리고 오른쪽부터 생기는 모양으로
public class Test05 {
    public static void main(String[] args) {
//        //풀이_미완성
//        for (int y = 0; y < 5; y++) {
//            for (int x= 0; x < 5; x++)
//                x++; //여기부터 다시보기
//               for (int i = 0; i < x; i++) {
//
//                    System.out.print("*");
//                }
//                System.out.println("");

//--------------------------------------------------------------------
        //강사님 풀이
//            *****
//            ****
//            ***
//            **
//            *
//        String star = "*";
//        int colum = 5;
//        int row =5;
//
//        for (int k = 0; k < 5; k++) { //5개까지 돔
//            for (int i = 0; i < colum; i++) {
//                System.out.print(star);
//            }
//            System.out.println(); //}밖으로 배치? 별을 하나씩이 아닌 6개를 찍고 출력하기 위해서입니다.
//            colum--;
//        }
//    }
//}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

        String star ="*";

        int starcolum = 1;

        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < starcolum; i++) {
                System.out.print(star);
            }
            System.out.println();
            starcolum++;   // star문
        }
        //그대로 사용
        String space =" ";

        int spacecolum = 3;

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < spacecolum; i++) {
                System.out.print(space);
            }
            System.out.println();
            spacecolum--;   // space문
        }





    }
}

