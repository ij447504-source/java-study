package ex04.game;

public class Burger {

    String 재료1;
    String 재료2;
    String 재료3;
    int price;

    // 기본생성자
    Burger(){
        재료1 = "불고기";
        재료2 = "양상추";
        재료3 = "빵";
        price = 3800;
    }
    // 2. 여러조건의 햄버거들 ======================================
    //재료1개와 가격을 알고싶으면 첫번째 Burger로 나오게 설정
    Burger(String 재료1, int price){
        this.재료1 = 재료1;
        재료2 = "양상추";
        재료3 = "빵";
        this.price = price;
    }

    //베이컨, 토마토, 빵, 7000
    Burger(String 재료1, String 재료2, String 재료3, int price){
        this.재료1=재료1;
        this.재료2=재료2;
        this.재료3=재료3;
        this.price = price;
    }//=========================================================
    //4. 호출함수
    void show(){
        System.out.println(재료1);
        System.out.println(재료2);
        System.out.println(재료3);
        System.out.println(price);
    }
    //3. main
    public static void main(String[] args) {
        Burger b1 = new Burger();
        Burger b2 = new Burger();
        Burger b3 = new Burger();
        Burger b4 = new Burger();
        Burger b5 = new Burger();
        Burger b6 = new Burger();

        //개별설정값
        Burger b7 = new Burger("새우", 4000);
        //1번째 버거의 값은 이거야! 그걸 b7에 담을거야!
        Burger b8 = new Burger("한우불고기", 8000);
        Burger b9 = new Burger("베이컨","토마토","빵",7000);

        //호출함수
        b7.show();

    }
}