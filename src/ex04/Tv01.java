package ex04;

public class Tv01 { //<-클래스

    boolean status=false; // on이라는 상태, 상단에 적혀야함
    //매서드 만들기보아용
    void on(){
        System.out.println("tv가 켜졌어요"); //**Q
        status = true; //**Q
    }

    void off(){
        System.out.println("tv가 꺼졌어요");
        status=false;
    }

    //행위적는칸 , 클래스 바로 밑.

    //heap에 띄움, heap
    public static void main(String[] args) {
         Tv01 tv=new Tv01(); //객체(object) 생성//tv 라는 호출문 //*
        //new static 제외 다 찾음 heap에 넣음
        System.out.println(tv.status);  //"." = 연결 연산자. 그 주소에서 뭐 찾을거야?

        //객체의 상태를 true로 변경했습니다.
        //하지만 실무에서는 이렇게 사용X, 상태는 무조건 '행위'로 변경해야합니다.
        //아무 행위 없는데 상태를 지정하면 나중에 헷갈려요!

        tv.off(); //*
        //함수의 호출, 매개변수가 없어 인수를 넣지않음
        //원래는 위에부터 호출인데 점프해서 void on 실행, Q안에 실행**
        //매서드는 호출시에만 열림
        System.out.println(tv.status);

    }
}
