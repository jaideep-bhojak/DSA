package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = reverseTheArray(arr, 0, arr.length - 1);
        int start = 0, end = arr.length - 1;
        for (int item : arr){
            System.out.print(item);
        }
    }

    private static int[] reverseTheArray(int[] arr, int start, int end) {
        while (start <  end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
