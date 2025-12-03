package algo;

public class ChangeData3_2 {
    public static void main(String[] args) {
        int[] arr = {7,4,2,3,1,5,6};
        int temp;

        //1회전 7이 arr[6]자리로 갑니다.
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
        if (arr[3] > arr[4]) {
            //스왑
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }
        if (arr[4] > arr[5]) {
            //스왑
            temp = arr[4];
            arr[4] = arr[5];
            arr[5] = temp;
        }
        if (arr[5] > arr[6]) {
            //스왑
            temp = arr[5];
            arr[5] = arr[6];
            arr[6] = temp; //출력값 4 2 3 1 5 6 7
        }


        //2번째행
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
        if (arr[3] > arr[4]) {
            //스왑
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }
        if (arr[4] > arr[5]) {
            //스왑
            temp = arr[4];
            arr[4] = arr[5];
            arr[5] = temp;   //출력값 2 3 1 4 5 6 7
        }

        //3번째행
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
        if (arr[3] > arr[4]) {
            //스왑
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp; //출력값 2 1 3 4 5 6 7
        }
        //4번째행
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
            arr[3] = temp; //출력값 1 2 3 4 5 6 7
        }

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
        if (arr[3] > arr[4]) {
            //스왑
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp; //출력값 2 1 3 4 5 6 7
        }
        //5번째행
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
        //6번째행
        if (arr[0] > arr[1]) {
            //스왑
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;

        }


            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");

            }

        }

    }

