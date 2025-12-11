package algo;

import java.util.Arrays;
import java.util.Random;

public class LottoApp {
    public static void main(String[] args) {
        // 1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        // 2. 로또 번호 받기
        int n;
        boolean isSame; // 매번 isSame 초기화

        for (int k = 0; k <6; k++) {
            while (true) {
               isSame = false;
                n = rand.nextInt(45) + 1; // <- 15

                // [9][15][]

                for (int i = 0; i < k; i++) {
                    if(arr[i] == n) {
                        isSame = true;
                    } //i알아서 증가하니 지워도됨
                }

                    if (!isSame) {
                        arr[k] = n;
                        break;
                    }
                }

            }

            Arrays.sort(arr);
            for(int a : arr){
                System.out.println(a+" ");
            }
    } //end of main
}