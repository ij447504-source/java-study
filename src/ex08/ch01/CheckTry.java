package ex08.ch01;

/**
 * checked exception
 * unChecked exception
 */
public class CheckTry {

    static void m1() throws Exception { //throws Exception : m1 호출 > 안되면 jvm에서 잡음
        throw new Exception("강제로 던진 Checked Exception");
    }

    static void m2(){
        throw new RuntimeException("강제로 던진 Unchecked Exception");
    }//RuntimeExceptio : 호출시킨코드에 떠넘기기 가능

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        m2();
    }
}
