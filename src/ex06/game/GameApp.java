package ex06.game;

public class GameApp {

    // u1 -> u2를 공격

    static void start(Protoss u1, Protoss u2) {

//        u2.hp = u2.hp - u1.attack;
        int remainHp = u2.getHp() - u1.getAttack();
        u2.setHp(remainHp);
    }



    public static void main(String[] args) {
        Zealot z1=new Zealot(); //heap1
        Zealot z2=new Zealot(); //heap2
        Dragoon d1 = new Dragoon(); //heap 3

        start(z1,d1); //static 개수에 맞게 생성

        // 1. 드라곤의 상태확인
        System.out.println(d1.getHp());

        start(d1,z1);

        //2. 질럿의 상태확인
        System.out.println(z1.getHp());

        start(z1,z2);
        //3. 질럿2의 상태확인
        System.out.println(z2.getHp());

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
