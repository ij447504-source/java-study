package ex13;
//오브젝트의 장단점
class Box{
   Object data;

}

public class Ge01 {
    public static void main(String[] args) {
        Box box = new Box(); // new Box()로 인해 Box heap공간생성 + Dbject 타입
        //Box(가리키는 방향) box(교실 안에 들어있음),  data라는
        //??이 개념을 그림으로 보고 싶어
        box.data = "안녕";

        String castData = (String) box.data;
        int len = castData.length();
        System.out.println(len);


    }
}
