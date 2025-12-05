package ex06.ch02;

class Animal {
    int i = 1;
    String name = "동물";
}

class Cat extends Animal {
    int i = 2;
    String name = "고양이";
    int age = 5;
}

class Dog extends Animal {
    int i = 3;
    String name = "강아지";
}

public class ExVar01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println(a1.i + ", "+a1.name); //1, 동물

        Dog a2 = new Dog();
        System.out.println(a2.i + ", "+a2.name); // 3, 강아지

        Animal a3 = new Dog();
        System.out.println(a3.i + ", "+a3.name);//1, 동물

        Cat a4 = new Cat();
        System.out.println(a4.i + ", "+a4.name + ", "+a4.age); // 2, 고양이, 5,
        // 만약 cat의 클래스가 String name 값을 "고양이"를 안 들고 있다면 부모변수에서 "동물"을 추출

    }
}
