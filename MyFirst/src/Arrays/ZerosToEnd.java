package Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, 0, 5};
        arr = sendZeroesToEnd(arr);
        for (int item: arr){
            System.out.print(item+ " ");
        }
    }

    public static int[] sendZeroesToEnd(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=3 && arr[j] == 3){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 3){
                j++;
            }
        }
        return arr;
    }

}
