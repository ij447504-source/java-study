package ex13;
//new 할때 타입을 경정할 수 있게 해주는 제네릭
class Box2<T>{
    T data; //new 할 때 type확정
}


public class Ge02 {
    public static void main(String[] args) {
//        Box2 box2 = new Box2(); // T를 결정하지 않은 상태에선 오브젝트 타입이됨
        Box2<String> box2 = new Box2();
        box2.data = "안녕";
        int len = box2.data.length();
        System.out.println(len);
//==========================================
        Box2<Integer> box3 = new Box2();
        box3.data =5;
        System.out.println(box3.data);


    }
}
