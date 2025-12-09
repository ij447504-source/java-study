package ex07;

//can do
interface 리모컨이할수있는것 {
    public abstract void power();
}

abstract class 리모컨 implements 리모컨이할수있는것{
    private boolean power;

    public 리모컨() { //직접 new를 할 수 없음
        this.power = false;
    }

    public void power(){
        this.power = !this.power; //! = 부정연산자 true <-> false로 보는 등
    }

    public boolean isPower() { //boolean 타입은 get이 아닌 isPower로 진행
        return power;
    }
}
class 엘지리모컨 extends 리모컨{
    public 엘지리모컨() {
        super(); //super(); = 부모를 의미
    }

}

class 삼성리모컨 extends 리모컨{
    public 삼성리모컨() {

    }

}

//인터페이스 :(상하관계의 약속)
public class InterApp {
    public static void main(String[] args) {
        리모컨 r1 = new 삼성리모컨();
        r1.power(); //켜다
        System.out.println(r1.isPower());
        r1.power(); //끄다
        System.out.println(r1.isPower());
    }
}
