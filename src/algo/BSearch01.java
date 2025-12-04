package algo;

import java.util.Arrays;

//2 찾기
public class BSearch01 {
    public static void main(String[] args) {
        int[] arr = {10,4,1,2,3};

        //1. 정렬{1,2,3,4,10}
        Arrays.sort(arr);

        //2. 검색
        if(10 == arr[2]){
            System.out.println("10을 찾았습니다.");
        }
        if(10 < arr[2]){ // flase, arr[2] = 3
            System.out.println("10는 작아요");

            if(10==arr[1]){
                System.out.println("10를 찾았습니다.");
            }

        }else{
            System.out.println("10은 커요");

            if(10 ==arr[3]) { //arr[2]보다 값이 커요, 큰방향 arr[3]으로 가보자!
                System.out.println("10을 찾았습니다");
            }else{//틀리면 무조건 arr[4]가 답입니다
                System.out.println("arr[4]번지에 10이 있습니다.");
            }
        }

        System.out.println("main끝");
    }
}
