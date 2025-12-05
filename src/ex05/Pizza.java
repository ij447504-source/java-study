package ex05;

/**
 * 교재 201p
 * 정적 변수 사용하기
 * 어떤 가게에서 하루에 판매되는 피자의 개수를 알고 싶다고 하자 . 개수를 알기 위해서는 지금까지 피자가 얼마나 생성되었는지를 알아야 한다
 * 이러한 경우 정적 변수를 선언하고 생성자에서 개수를 증가시키면 된다.
 *
 *
 *
 */
public class Pizza {
    private String toppings;
    private  int radius;
    static final double PI = 3.141592;
    static int count = 0;//정적변수

    public Pizza(String toppings){
        this.toppings = toppings;
        count++;
    }
}
