package ex06;
// 오버라이드 2문제풀기
// 이거 풀기
// 도전, 다 하면 더블어쩌고 구현 해보기
class MyLikedList {
    Node root;

    public void add(Node node){

    }

    public void remove(Node node){

    }

    public MyNode get(String key){
        return null;
    }
}

class MyNode {
    String key;
    String value;
    Node next;

    public MyNode(String key, String value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}



public class MyList02 {
    public static void main(String[] args) {
        MyLikedList myList = new MyLikedList();

        myList.add(null);
        myList.add(null);
        myList.add(null);

        myList.remove(null);

        MyNode node = myList.get("name");
    }
}