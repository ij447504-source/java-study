package example01;

public class Dog {
    private int age;
    private String name;
    private String color;

    // 책임 : age 값 변경
    public void setAge(int age){
        this.age = age;
    }

    // 책임 : name 값 변경
    public void setName(String name){
        this.name = name;
    }

    // 책임 : color 값 변경
    public void setColor(String color){
        this.color = color;
    }

    // 책임 : age 값 확인
    public int getAge(){
        return age;
    }

    // 책임 : name 값 확인
    public String getName(){
        return name;
    }

    // helloworld -> HelloWorld (클래스 - 파스칼표기법)
    // helloworld -> helloWorld (변수명, 메서드명 - 낙타표기법)
    // 책임 : color 값 확인
    public String getColor(){ // 카멜표기법
        return color;
    }
}
