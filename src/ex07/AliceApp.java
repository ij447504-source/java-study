package ex07;
//오버라이드
//재정의

abstract class 판사 { // abstract : 추상적인
    //구체적인 행위가 오브젝트마다 다를 때!! 
    public abstract void 심문();

    public void 종료() {
        System.out.println("판사놀이 중인 부모는 심문을 종료한다.");
    }
}

class 왕 extends 판사 { //판사 is 왕
    public void 심문() { //행위
        System.out.println("왕은 심문한다.");//행위
    }
}
    class 왕비 extends 판사 {
        public void 심문() { //행위
            System.out.println("왕비은 심문한다.");//구체적 행위
        }
    }
        // ================================
        abstract class 증인 {
            public abstract void 대답();

        }


        class 모자장수 extends 증인 {
            public void 대답() {
                System.out.println("모자장수는 대답한다.");//행위
            }
        }

        class 앨리스 extends 증인 {
            public void 대답() {
                System.out.println("앨리스는 대답한다.");//행위
            }
        }

        public class AliceApp {
            public static void main(String[] args) {
                //1. 초기화(인스턴스). 증인과  판사는 new 불가
                증인 c1 = new 모자장수();
                증인 c2 = new 앨리스();
                판사 c3 = new 왕();
                판사 c4 = new 왕비();

                // 2.실행
                c1.대답();
                c2.대답();

                c3.심문();
                c3.종료();

                c4.심문();
                c4.종료();

            }
        }

