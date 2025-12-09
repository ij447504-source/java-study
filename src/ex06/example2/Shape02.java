package ex06.example2;

class Circle extends Shape02{
    void draw(){
        System.out.println("원을 그립니다");
    }
}
class Rectangle extends Shape02{
    void draw(){
        System.out.println("사각형을 그립니다");
    }

}
class Triangle extends Shape02{
    void draw(){
        System.out.println("삼각형을 그립니다");
    }
}
public class Shape02 {
    void draw(){
        System.out.println("도형을 그립니다");
    }
}
