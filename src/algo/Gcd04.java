package algo;
// 책임 : 약수를 구해서 리턴하기
public class Gcd04 {
    static  int[] 약수구하기(int a){ //void>int로 변경, 배열로 만들기위해 []추가//(1)
        int[] arr1 =new int[a]; //(2) //arr1=6의 약수값 {1,2,3,6,0,0}
        int n1 = 0; //(3)k1까지 복붙
        int k1=1;
        for (int i = 0; i < a; i++) {
            if (a % k1 == 0) {
                arr1[n1] = k1;
                n1++;
            }
            k1++;
        }
        return arr1; //(4)
    }
    static int 최대공약수구하기(int[] arr1, int[] arr2) {//int값지정
        int result = 0;
        int c = 0;

        for (int i = 0; i < 4; i++) {
            //6의약수: [1][2][3][6]/8의약수:[1][2][4][8]
            // 6의약수 기준으로 4개니깐 총4바퀴 돌기,8의 약수는 리스트 추가
            if (arr1[c] == arr2[0]) result = arr1[c];
            if (arr1[c] == arr2[1]) result = arr1[c];
            if (arr1[c] == arr2[2]) result = arr1[c];
            if (arr1[c] == arr2[3]) result = arr1[c];
            c++;
        }
        return result;
    }
    public static void main(String[] args) {

        //1. 약수구하기
        int[] arr1 =약수구하기(6);
        int[] arr2 =약수구하기(8);
        //2. 최대공약수 구하기
        int result = 최대공약수구하기(arr1, arr2);

        //3. 결과 확인
        System.out.println("최대공약수는 ="+result);

    } //end of main
}
