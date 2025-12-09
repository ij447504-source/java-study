package ex08;

public class Try02 {

    static void start(){
        throw new RuntimeException("예외가 발생함");
    }
    public static void main(String[] args) {

        try {
            start();
        }catch(RuntimeException e){   //Q안에 터진 것 catch에서 잡기
            System.out.println("괜찮아");
        }

    }
}
