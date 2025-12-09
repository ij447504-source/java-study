package ex06;
//char 활용하기

/**
 * char는 문자 하나를 표현해야 할 때 사용하는 자료형
 * 예를 들어 'A', 'b', '3', '+', '%' 같은 한 글자를 저장할 때
 * 내부적으로 숫자라서 계산이나 비교가 쉬워서 많이 사용된다!
 */
public class MyHash03 {
    public static void main(String[] args) {
        char[] arr = {'A','B','C'}; // A = 65, B =66, C= 67


        int h =0;

        // 스탭1
        int n = arr[0]; //h=65

        h = h * 31 + n; //h = 65

        // 스탭2
        n = arr[1]; //66
        h = h * 31 + n;//h :2081 _  65*31+65

        // 스탭3
        n = arr[2]; //67
        h = h * 31 + n; // h= 2081  * 31+67 =64578

        System.out.println(h); //hash 값 64578

    }
}
