package comp;
//중복된 수만 제거
public class LotteApp {
    public static void main(String[] args) { //toString 덕에 편하게 작업 없으면 get을 활용  ㅠㅠ
        // 1. 버거만 주세요.
        Burger b1 = new Burger("기본버거",1000);
        //정해진 틀안에 내용을 넣을 수 있음!
        System.out.println(b1);
        System.out.println();

        //2. 콜라만 주세요.
        Coke c1 = new Coke("콜라",500);
        System.out.println(c1);
        System.out.println();

        //3. 쉬림프 버거 세트 주세요
        //고객에게 이미 판매했기에 새로 꺼내기 new 3번
        ShrimpBurger sb2 = new ShrimpBurger("새우버거",2000,"새우");
        Coke c2 = new Coke("콜라",500);
        Potato p2 = new Potato("감자튀김",1500);

        BurgerSet set = new BurgerSet(sb2,c2,p2);
        System.out.println(set);//=set.toString 생략문
        System.out.println(set.getTotalPrice());
    }
}
