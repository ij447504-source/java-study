package comp;
//상속불가, 필드추가로 재료추가

import ex06.game.Protoss;

/**
 * 1. is 상속_물려주는 것은 부가적인 효과
 * 2. can do 인터페이스
 * 3. has 결합(Composite) - 상태로 가지면 됨. //잘 만든것을 쓰고 싶을 때 상속이 아닌 has 사용
 */
public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato; //이름을 한번 더 적는 이유 : private(접근제어자) Potato(타입-교실) potato(주소)

    public BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
        System.out.println("버거세트가 만들어졌어요.");


    }
    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

    public int getTotalPrice(){
        int totalPrice = burger.getPrice() + coke.getPrice() + potato.getPrice();
        totalPrice = (int)(totalPrice * 0.9);
        return totalPrice;
    }

    @Override
    public String toString() {
        return "BurgerSet{" +
                "burger=" + burger +
                ", coke=" + coke +
                ", potato=" + potato +
                '}';
    }
}
