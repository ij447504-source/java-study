package ex04;

public class People {
    // ; : 유연 / = 고정값
    private String name; //이름
    private int height; //키
    private int weight; //무게

    People(String name, int height, int weight){ //객체 초기화 용도로만 사용
        //초기화
        this.name =name;
        this.height =height;
        this.weight =weight;

    }
    //상태변경
    public void 밥먹기(){ //heap
        weight = weight + 2;
    }


    //상태확인
    public int getWeight() {
        return weight;
    }



        /**
         * 객체지향 특징
         * 메서드 : 상태변경
         * 생성자 : 상태고정
         * 상태: private 적용, 직접적용x 매서드를 통해서만 상태변경가능,분석을위해
         * 행위: 매서드에 public 적용
         */
    }

