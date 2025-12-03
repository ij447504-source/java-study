package algo;

public class ChangeData3_1 {
    public static void main(String[] args) {
        // sort 정렬 (오름차순 1,2,3)
        int[] arr = {4, 2, 3, 1};
        int temp;
        // 0,1 주소 비교 -> 참 -> 스왑 {2,3,1}
        //1회전 4가 끝으로 갈거임
        if (arr[0] > arr[1]) {
            //스왑
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;

        }
        if (arr[1] > arr[2]) {
            //스왑
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        if (arr[2] > arr[3]) {
            //스왑
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }
        //2회전 3가 끝으로 갈거임
        if (arr[0] > arr[1]) {
            //스왑
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if (arr[1] > arr[2]) {
            //스왑
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        //3회전 2가 제일 끝 마지막 -2자리로 감
        if (arr[0] > arr[1]) {
            //스왑
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
