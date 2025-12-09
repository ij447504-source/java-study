package ex06;
//오버라이드 참고
import java.util.HashMap;

public class MyHash04 {
    public static void main(String[] args) {
        //해쉬는 자동 재배열 가능
        HashMap<String, String> arr = new HashMap<>();//<찾는 키캆의 타입>
        arr.put("age","1"); //키, 벨류  : 키값을 통해 해쉬값을 찾음
        arr.put("name", "임꺽정");

        //put할때마다 새롭게 배열배치
        System.out.println(arr.get("name"));

    }
}
