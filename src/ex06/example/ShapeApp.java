package ex06.example;

public class ShapeApp {
    public static void main(String[] args) {
        //int[] arr2 = new int[3];
        Shape[] arr = new Shape[3];

        Circle a1 = new Circle(); // [Shape교실과 Circle(a1은 circle을 바라봄) 교실이 같이 떠]
        Rectangle a2 = new Rectangle(); // [Shape교실과 Rectangle(a2은 Rectangle을 바라봄) 교실이 같이 떠]
        Shape a3 = new Triangle(); // [Shape(a3은 Shape를 바라봄)교실과 Triangle 교실이 같이 떠]

        a1.draw(); //for-each문 배열이나 리스트의 모든 요소를 하나씩 꺼내면서 반복할 때 사용하는 문법.
        a2.draw();
        a3.draw();
    }
}
