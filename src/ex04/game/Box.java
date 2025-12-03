package ex04.game;

class Box {
    int width, height, depth;
//    Box(){}
//
//    Box(int w, int h, int d) {
//        width =w;
//        height=h;
//        depth=d;
//    }

    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("상자의 크기: (" +b.width + ","+b.height + ","+b.depth+")");

    }
}
