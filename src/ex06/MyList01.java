package ex06;
/**
 * Node는 순서대로 잇고 싶거나(Linked List),
 * 위아래 계층을 만들고 싶거나(Tree),
 * 여러 길(관계)을 표현하고 싶을 때(Graph) 사용하는 기본 단위!
 */




class Node {
    String key;
    String value;
    Node next;

    public Node(String key, String value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class MyList01 {
    public static void main(String[] args) {
        // 1. 첫번째 노드
        Node n1 = new Node("name", "홍길동", null);

        // 2. 두번째 노드
        Node n2 = new Node("age", "11", null);
        n1.setNext(n2);

        // 3. 세번째 노드
        Node n3 = new Node("weight", "50", null);
        n2.setNext(n3);

        System.out.println(n1.value);
        System.out.println(n1.next.value); //2번째 노드값을 컴퓨터를 알아볼 수  없어서 next 사용
        System.out.println(n1.next.next.value);

        //4. n2 삭제하기 (함수 또는 노가다)

        n1.setNext(n3);
        System.out.println(n1.value);
        System.out.println(n1.next.value); //next 값이 없음



    }
}