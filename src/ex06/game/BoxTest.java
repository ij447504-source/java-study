package ex06.game;

class Box2{
    int width, height, depth;
    
    Box2(){
        System.out.println("안녕");
    }
}
public class BoxTest {
    public static void main(String[] args) {
        Box2 b =new Box2();
        System.out.println("상자의 크기: (" +b.width + "," + b.height + ","+b.depth + ")");

        // 기본 생성자 : 매개 변수가 없는 생성자로 자동적으로 변수들의 기본값으로 초기화
        //출력값 : 상자의 크기:( 0,0,0)
        //그래서 상자의 크기인 width, height, depth가 모두 0으로 된것을 볼 수 있다.
    }
}
