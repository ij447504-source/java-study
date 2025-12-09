package ex08;

/**
 * 예외처리
 */
public class Try01 {
    public static void main(String[] args) {
        throw new RuntimeException("강제로 예외를 터트림");//예외는 나를 호출한 곳으로 간다(제어권)

        }
}
