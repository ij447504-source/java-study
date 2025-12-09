package ex06;

public class MyHash02 {
    public static void main(String[] args) {
        char c = 'A';//문자 하나 저장하는 기본 저장형
        System.out.println(c);
        byte b = (byte) c; //char 2byte 한글가능, 다운캐스팅 2byte > 1byte
        //추출값 65  = 아스키코드
        System.out.println(b);

        byte b1 = 65;
        char c1 = (char)b1; //캐스팅변환
        System.out.println(c1);


    }
}
