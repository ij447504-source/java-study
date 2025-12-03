package ex04;
//계산기 만들기
// add(+), minus(-), multi(*), divide(/) 컨슈머로 만들기
public class Cal02 {

    static int add(int a, int b){
        return a+b;

    }

    static int minus(int a, int b){

        return a-b;
    }

    static int multi(int a, int b){

        return a*b;
    }

    static int divide(int a, int b){

        return a/b;
    }


    public static void main(String[] args) {
        int r1= add(3,5); //클래스 이름 Cal01 같은 파일내에서 생략가능
        int r2= minus(3,5);
        int r3= multi(3,5);
        int r4= divide(3,5);

        System.out.println(r1+r2+r3+r4);

    }
}