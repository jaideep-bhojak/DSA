package Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        //numbers are from 1 to n; or n natural numbers;
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 7, 10};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int len = arr.length;
        len++;
        int sum = len * (len+1)/2;
        for (int item : arr){
            sum -= item;
        }
        return sum;
    }
}
