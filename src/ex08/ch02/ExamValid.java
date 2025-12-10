package ex08.ch02;



import java.util.Scanner;

public class ExamValid { //1. 힙공간 생성


    int[] arr;  //2. 초기화

    public ExamValid() {  //3. 배열
        this.arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
    }

    void searchArr(int index) {
        System.out.println("찾으시는 배열 공간의 값은 : " + arr[index]);
    }

    // 문제 : 잘못된 인덱스 번호를 넣으면 "[0~2]까지 입력가능합니다"라고 출력해주세요!!
    // if를 사용하여 validation 체크하기
    public static void main(String[] args) {
        ExamValid examTry = new ExamValid();
        Scanner sc = new Scanner(System.in);  //4. 스캐너로 값을 받음
        System.out.println("찾고 싶은 배열의 index를 입력하세요");

        while (true) { //5. 영원히 끝나지 않을 와일문
            int index = sc.nextInt(); //리스너 : 입력되는 값을 지켜봄 _돌고 있어 코드가 하단으로 못 내려감
            // 숫자를 받아 int index로 넘어감 > examTry.searchArr(index); 받아서 다시 돔

            // if 코드를 여기에 작성하세요.
            if (index >= 0 && index < 3) { //0~2
                examTry.searchArr(index); //examTry라는 객체에게, 그 안에 있는 searchArr이라는 기능을 실행해줘! 그리고 index 숫자를 넘겨줘
                //arr[0] = 5
                //arr[1] = 6
                //arr[2] = 7 여기서 인덱스 값은 0,1,2입니다.

            } else {
                System.out.println("[0~2]까지 입력가능합니다"); //적정값 넣으면 while값 다시 돔, 꺼야함

            }
        }
    }
}