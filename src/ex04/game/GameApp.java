package ex04.game;

public class GameApp {

    // u1 -> u2를 공격

    static void start(Zealot u1, Dragoon u2){ //u1은 이름일뿐 z1와 동일하게 작성안해도됨
        u2.hp = u2.hp - u1.attack;
    }

    static void start(Dragoon u1, Zealot u2){ //같은 이름에 여러가지의 임무, 다른 것으로 인식, 오버로딩
        u2.hp = u2.hp - u1.attack;
    }//드라곤이 질러때리기, 질럿의 상태확인필요

    static void start(Zealot u1, Zealot u2) { //같은 이름에 여러가지의 임무, 다른 것으로 인식, 오버로딩
        u2.hp = u2.hp - u1.attack;
    }
    public static void main(String[] args) {
        Zealot z1=new Zealot(); //heap1
        Zealot z2=new Zealot(); //heap2
        Dragoon d1 = new Dragoon(); //heap 3

        start(z1,d1); //static 개수에 맞게 생성

        // 1. 드라곤의 상태확인
        System.out.println(d1.hp); //맞은애

        start(d1,z1);
        //2. 질럿의 상태확인
        System.out.println(z1.hp);

        start(z1,z2);
        //3. 질럿2의 상태확인
        System.out.println(z2.hp);

        //오버로딩의 예
        System.out.println();
        System.out.println(1);
        System.out.println("");
        System.out.println(1.2);
        System.out.println(true);
        /**
         * 오버로딩의 장점
         * 사용자 관점에서 동일한 함수를 통해 여러가지 활용가능
         */
    }
}
