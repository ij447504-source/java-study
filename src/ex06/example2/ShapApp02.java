package ex06.example2;

public class ShapApp02 {
    public static void main(String[] args) {
        Shape02[] arr = new Shape02[3];

        Circle a1 = new Circle();
        Rectangle a2 = new Rectangle();
        Triangle a3 = new Triangle();

//        a1.draw(); //일반 노가다추출코드
//        a2.draw();
//        a3.draw();

        arr[0] = a1; //(for-each을 위해서 배열담기)
        arr[1] = a2;
        arr[2] = a3;

        for (int i = 0; i < 3; i++) { //(for-each 문)
            arr[i].draw();
        }
    }
}
