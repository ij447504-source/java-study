package ex01;

public class Var01 { //기본자료형 특징 : 공간확보가능
    public static void main(String[] args) {
        byte a1=100; 
        /*메모리 한 칸(byte)을 확보해라 몇번 방이 노는지 모르니 남는 
        인덱스인 a1방을 확보해줄게, a1=변수명,그래서 우린 인덱스번호가 어디인지 알필요없음 (a1은 자동으로 뜸) */
        /* = 대입, 교재 55p 기준 byte의 범위 -128~127이기에 가능, 150을 넣으면 에러발생,툴을통해검증 */
        /*컴퓨터는 enter의 의미를 구분두지않아 ;으로 구분 */

        /*저장변수수 */
        int a2 = 2000000000; /*4칸 안에 20억이라는 값이 들어감 -숫자저장*/
        double a3 = 1.5; 
        boolean a4 = true; /*1칸 안에 true라는 값이 들어감 */
        System.out.println(a3);

        
        
    }
}
    

