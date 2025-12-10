package algo;

import java.util.Random;

// 로또만들어보기_최종본
public class LottoApp2 {
    public static void main(String[] args) {
        int[] arr = new int[6];//정수 6개를 저장할 수 있는 배열 공간을 만들어라

        Random r = new Random();

        // 1번째 숫자는 그냥 넣기
        int n = r.nextInt(45) + 1;
        // Tip! n값은 계속 변화하기 때문에 n1,n2등을 사용하지 않아도 됨
        arr[0] = n; //Tip! 정확한 값이 아닌 주소를 넣어주면 값이 변경돼도 사용가능

        // 2번째 숫자는 [0]번지랑 비교해서 다르면 넣기
        while(true){
            n = r.nextInt(45) + 1; // 5
            if(arr[0] != n){
                arr[1] = n;
                break;
            }
        }

        // 3번째 숫자는 [0],[1] 번지랑 비교해서 다르면 넣기
        while(true){ //while문은 끝날지 모르는 내용을 돌려야할때 사용
            n = r.nextInt(45) + 1; // 7
            if(arr[0] != n){ // 7과 5
                if(arr[1] != n){ // 7과 6   //Tip if 안에 if 사용가능
                    arr[2] = n;
                    break;
                }
            }
        }

        // 4번째 숫자는 [0],[1],[2] 번지랑 비교해서 다르면 넣기
        while(true){
            n = r.nextInt(45) + 1; // 7
            if(arr[0] != n){ // 7과 5
                if(arr[1] != n){ // 7과 6
                    if(arr[2] != n){ // 7과 6
                        arr[3] = n;
                        break;
                    }
                }
            }
        }



        }
    }
