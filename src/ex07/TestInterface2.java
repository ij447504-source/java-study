package ex07;
//예제 7-2, 288p

interface RemoteControl {
    void turnOn();
    void turnOff();
    public default void printBrand() {
        System.out.println("Remote Control 가능 TV");
    }
}

class Television implements RemoteControl {
     boolean on;
     public void turnOn() {
            on = true;
            System.out.println("TV가 켜졌습니다.");
        }

     public void turnOff() {
         on = false;
         System.out.println("TV가 꺼졌습니다.");
     }
     public void printBrand() {
                System.out.println("Power Java Tv입니다.");
         }
     }


     public class TestInterface2 {
            public static void main(String[] args) {
                RemoteControl obj = new Television();
                obj.turnOn();
                obj.turnOff();
                obj.printBrand();
            }
        }
