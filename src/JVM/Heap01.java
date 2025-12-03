package JVM;

class Student{ //heap 객체 소속, Heap, Heap 영역에 Student 객체가 만들어지고 그 안에 no, name, age 변수가 포함
    int no;
    String name;
    int age;
    static String school = "그린아카데미";

    void setNo(int no){//no는 임시변수, setNo가 끝나면 사라진다. 잠깐 쓰는 것은 stack에 저장
    }

    // 상태 확인
    void show(){
        System.out.println(no);
        System.out.println(name);
        System.out.println(age);
        System.out.println(school); //자기코드안에 있는건 . 안 넣어도됨 school
        System.out.println();
    }
}

public class Heap01 {

    static int num =10;

    public static void main(String[] args) {
        Student s1 = new Student(); //new Student() main에 뜸
        s1.no = 1; //지역변수 무조건 4byte, heap
        s1.name = "홍길동";
        s1.age = 20;
        s1.show();

        Student s2 = new Student();
        s2.no = 2;
        s2.name = "장보고";
        s2.age = 20;
        s2.show();

        s2.setNo(5); // 장보고 번호 변경
        s2.show();

        System.out.println(Heap01.num);
    }
}
