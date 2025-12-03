package ex04;
//계산기 만들기
// add(+), minus(-), multi(*), divide(/) 컨슈머로 만들기
public class Cal01 {

    static void add(int a, int b){
        System.out.println("a+b="+(a+b));
    }

    static void minus(int a, int b){
        System.out.println("a-b="+(a-b));
    }

    static void multi(int a, int b){
        System.out.println("a*b="+(a*b));
    }

    static void divide(int a, int b){
        System.out.println("a/b="+(a/b));
    }


    public static void main(String[] args) {
        add(3,5); //클래스 이름 Cal01 같은 파일내에서 생략가능
        minus(3,5);
        multi(3,5);
        divide(3,5);
    }
}