package algo;

public class ChangeData3 {
    public static void main(String[] args) {
        //{1,2,3,4,5,6,7,8,9,10}->{10,9,8,7,6,5,4,3,2,1} reverse
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //컴퓨터 입장에서는 가운데 값을 못 봄
        int temp;

        //1.
        temp=arr[9];
        arr[9] =arr[0];
        arr[0]=temp;

        //2.
        temp=arr[8];
        arr[8] =arr[1];
        arr[1]=temp;

        //3.
        temp=arr[7];
        arr[7] =arr[2];
        arr[2]=temp;

        //4.
        temp=arr[6];
        arr[6] =arr[3];
        arr[3]=temp;

        //5.
        temp=arr[5];
        arr[5] =arr[4];
        arr[4]=temp;

        //
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
