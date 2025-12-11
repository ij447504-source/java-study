package ex13;
//교재 컬렉션이란? 559~560p


import java.util.ArrayList;
import java.util.List;

public class Collect01 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();//내부 10칸 Object 배열 생성 [Integer 타입]
        //10칸이 넘어가면 칸이 늘어납니다.
        //1. 추가
        arr.add(1); //1칸
        arr.add(3); //2칸
        arr.add(5);

        //2. 찾기
        System.out.println(arr.get(2)); //값 : 5
        //3. 제거
        arr.remove(0);
        System.out.println(arr.size()); //꼭 값을 학인하지 않아도 사이즈로 보면됨, 3개중1개 삭제로 2가됨

        //4. contains
        boolean isThree = arr.contains(3);
        System.out.println(isThree); //출력값 : True
        //5. 배열로 출력
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        for(Integer i : arr){ //(요소 : arr) for each문
            System.out.println(i);
        }




    }
}
