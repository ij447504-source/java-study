package ex05;
// 교재 198p
// 예제 5-1. 피자 객체 2개를 받아서 더 큰 피자 객체를 반환하는 메소드 Pizza whosLargest(Pizza p1, Pizza p2)를 작성하라

public class PizzaTest {
    public static void main(String[] args) {
        Pizza02 obj1 = new Pizza02(14);
        Pizza02 obj2 = new Pizza02(18);

        Pizza02 largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼"); //largest.radius = new 값

    }

    static class Pizza02{
        int radius;

        Pizza02(int r){
            radius = r;
        }
        Pizza02 whosLargest(Pizza02 p1, Pizza02 p2){
            if(p1.radius > p2.radius)
                return p1;
            else
                return p2;
        }
    }
}
