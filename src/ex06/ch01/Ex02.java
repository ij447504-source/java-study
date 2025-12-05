package ex06.ch01;

class 지구인{

}
class 유럽인 extends 지구인{

}
class 아시아인 extends 지구인{
    String color = "황색";

}
class 한국인 extends 아시아인{ //extends : 확장하다

}
class 일본인 extends 아시아인{

}
class 영국인 extends 유럽인{

}

public class Ex02 {
    public static void main(String[] args) {
        한국인 s1 = new 한국인(); //[한국인 - 아시아인 - 지구인] // type = 한국인
        //System.out.println(s1.color); 지구인 s1 불가 / 아시아인 s1 가능 / 한국인 s1 가능
        // (한국인은 아시아인의 변수를 타고 올로가서 "황색"값을 찾는 것임, 이때 한국인기준 아시아인은 부모임)
        System.out.println(s1.color); // 추출값 : "황색"
    }
}
