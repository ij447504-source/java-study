package ex04;

class Retangle {
    //변수선언

    int w;
    int h;

    // 기본 생성자_자바의 자동초기화 규칙_
    // 생성자 안에 코드가 없음
    // w,h에 아무 값도 안 넣음
    Retangle(){

    }
    //전달된 값을 그대로 넣는 코드
    Retangle(int w, int h){
        //this =지금 만들어진 객체 자신_이 객체 안에 있는 w
        // this 사용이유 : 멤버변수와 매개변수의 구분, 안쓰면 값이 저장 안됨
        this.w = w; //5저장
        this.h = h; // 10저장
    }
}

public class MyBoxApp {
    public static void main(String[] args) {
        Retangle r1 = new Retangle(); //new와 Retangle을 따로 볼것
        Retangle r2 = new Retangle(5,10);
        System.out.println(r1.w);
        System.out.println(r1.h);
        System.out.println(r2.w);
        System.out.println(r2.h);
    }
}
