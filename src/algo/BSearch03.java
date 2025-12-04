package algo;

import java.util.Arrays;

//11 찾기
public class BSearch03 {
    public static void main(String[] args) {
        int[] arr = {10,4,1,2,3,0,11};

        //1. 정렬{0,1,2,3,4,10,11}
        Arrays.sort(arr);

        int target = 3;
        int mid=arr.length/2; //arr[3] = 3

        //2. 검색
        if(target == arr[mid]){ //0,1,2,[3],4,10,11
            System.out.println(target+"을 찾았습니다.");
            return; // 값 찾고 중단 _int랑 _ main끝은추출안함
        }

        if(target < arr[mid]){ //0,1,2,3,4,[10],11
            mid = 5; //10 //중간에서 양옆을 비교
        }
        if(target < arr[mid]){
            mid = 1; //1
        }

        if(target == arr[mid]) { //0,1,2,3,4,[10],11
            System.out.println(target + "을 찾았습니다.");
            return;
        }
        if(target < arr[mid]){ //0,1,2,3,4,[10],11
            mid = 6;  //11, 중간에서 양옆을 비교
        }
        if(target < arr[mid]){
            mid = 4;
        }

        if(target == arr[mid]) { //0,1,2,3,4,10,[11]
            System.out.println(target + "을 찾았습니다.");
            return;
        }

        System.out.println("main끝");
    }
}
