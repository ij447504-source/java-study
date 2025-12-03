package algo;
//배열을 많이 두었을 때 어떻게 재정렬 할것인가?
public class ChangeData2 {
    public static void main(String[] args) {
        //{1,2,3,4,5,6,7}->{7,6,5,4,3,2,1} reverse
        int[] arr = {1,2,3,4,5,6,7};
        //컴퓨터 입장에서는 가운데 값을 못 봄
        int temp;
        int a =6; //a의 시작값 =6
        int b = 0;
        int row = arr.length/2; //몇번 돌리고싶다.

        for (int i = 0; i < row; i++) {
            temp=arr[a];
            arr[a] =arr[b];
            arr[b]=temp;
            a--;
            b++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }


    }
}
