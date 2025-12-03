package ex01;

// 클래스 자료형 
class Dog{
    static int age = 5;
    static String name = "구름이";
    static String color ="노랑";
    
}/*첫글자는 대문자 , 찾을 때는 dog.age...*/

public class Var04 {
    public static void main(String[] args) {
        /*숫자와 문자를 같이 저장하고 싶다? */
        System.out.println(Dog.name);
    }
}
