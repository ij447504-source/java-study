package ex06.ch02;
//메서드찾기

class Car {
    void run(){}
}

class Morning extends Car{
    void run(){
        System.out.println("모닝 달린다");
    }
}

class Sonata extends Car{
    // 부모의 매서드를 재정의하면
    // 자식이 부모의 메서드를 오버라이드한다.
    // 오버라이드 : 무시하고 대신한다.
    void run(){
        System.out.println("소나타 달린다");
    }
}

public class ExMeh01 {
    public static void main(String[] args) {
        Morning a1 = new Morning(); //[Mornig(v), Cat] v=가리키고 있는 것 //a1을 바라봅 a1은 모닝
        a1.run();


        Car a2 = new Sonata();//[Sonata, Cat(v)] //a2는 자동차를 바라봄
        a2.run();
    }
}
