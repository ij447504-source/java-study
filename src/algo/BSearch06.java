package algo;


import java.util.Arrays;


public class BSearch06 {


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 9, 8, 7, 6, 5, 4, 3, 10}; //11개 log11 -> 3~4회 안에 끝남

        Arrays.sort(arr); // {0,1,2,3,4,5,6,7,8,9,10}

        int n = 1;
        int target = 6;  //타켓 10을 하면 log11 =3~4회만에 찾아낸다는 뜻
        int startIndax = 0;
        int endIndax = arr.length-1; //10번지까지 데이터 11개
        int mid; //0 초기화


        // {0,1,2,3,4,5,[6],7,8,9,10}
        // s=0, e=10, m=5(회전)
        // s=6, e=10, m=8 (2회전)
        // s=6, e=7, m=6 (3회전) 6 찾았당!

        while (true){
            mid = (endIndax - startIndax) / 2 + startIndax;
            if (target == arr[mid]) {
                System.out.println(target + "을 찾았습니다("+n+"라운드) " + arr[mid]);
                break; //6을 찾으면 종료
            }
            if(target < arr[mid]){
                endIndax = mid - 1;
            }
            if(target > arr[mid])
                startIndax = mid + 1;

            }
            n++;
        }


}
