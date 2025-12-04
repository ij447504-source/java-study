package example01;

public class DogApp {
    public static void main(String[] args) {
        // 1. 객체 생성
        Dog d1 = new Dog();

        // 2. 상태 변경 메서드로
        d1.setAge(5);
        d1.setColor("빨강");
        d1.setName("도롱이");
        
        // 3. 상태 확인 메서드로
        System.out.println(d1.getAge());
        System.out.println(d1.getName());
        System.out.println(d1.getColor());

        // 2. 상태 변경
//        d1.age = 1;
//        d1.name="흰둥이";
//        d1.color="하얀색";

        // 3. 상태 확인
//        System.out.println(d1.age);
//        System.out.println(d1.name);
//        System.out.println(d1.color);
    }
}
