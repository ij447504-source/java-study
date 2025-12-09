package ex06.example;

class Circle extends Shape {
    void draw() {
        System.out.println("원을 그립니다");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("사각형을 그립니다");
    }
}

class Triangle extends Shape{
    void draw() {
        System.out.println("삼각형을 그립니다");
    }
}

public class Shape {
    void draw() {
        System.out.println("도형을 그립니다");
    }
}
