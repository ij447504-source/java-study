package ex02;

public class Type01 {
    public static void main(String[] args) {
        // +, -, *, /
        int a1 = 10; // 4byte
        double a2 = 1.2; //8byte (소수점 가능)

        double sum1 = a1+a2; //더해서 무엇을 어떻게 해야하는지 알려줘야함 
        System.out.println(sum1); //현재까지 16byte 공간 사용 (4+8+8)
        
        int sum2 =(int)a2; //명시적 형변환/다운캐스팅_결과값 : 1 
        //괄호=문법
        System.out.println(sum2);
    
        double sum3 = a1; //묵시적 형변환/업캐스스팅_결과값 : 10.0
        System.out.println(sum3);

        byte a3 = (byte)300;  //-128~127까지 담을 수 있는데 다운캐스팅을 한다하면?
        //문법적 오류는 없지만 오류값이 추출됨, 자바의 디자인일뿐, 최대값을 추출하는 툴이면
        //오류값일때 127을 추출할 것임

        //문법이 다른 경우 as 사용 



        System.out.println(a3);

    }
}
