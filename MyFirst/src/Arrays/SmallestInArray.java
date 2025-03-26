package Arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] nums = {12, 34, 6, 89, 101};
        int result = Integer.MAX_VALUE;
        for (int num : nums){
            result = Math.min(num, result);
        }
        System.out.println("smallest is: "+ result);
    }
}
