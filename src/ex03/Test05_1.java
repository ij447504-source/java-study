package ex03;
//오른쪽에서 시작하는 별 만들기

public class Test05_1 {
    public static void main(String[] args) {
        //3행!! space2, star1
        //star는 1번부터 시작,space는 두번째 칸부터 나옴 *
        //4행!! space3, star1
        // **
        //5행!! space4, star1
        //***


        String space =" ";
        String star ="*";
        int row=3; //줄 //10으로 바꾸면 10개 나옴
        int n1 =row-1;
        int n2 =1; //별 한개로 시작

        for (int K = 0; K < row; K++) { //3바퀴돌리기
            for (int i = 0; i < n1; i++) {
                System.out.print(space);
            }
            for (int i = 0; i < n2; i++) {
                System.out.print(star);
            }
            System.out.println();
            n1--; //2부터 스페이스를 하나씩 줄여줘
            n2++; //1부터 별을 하나씩 늘려줘
        }

    }
}
