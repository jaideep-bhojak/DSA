package Arrays;

public class FindingSecondMax {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] ar2 = {0, 1, 2};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        double stTime = System.currentTimeMillis();
        System.out.println(stTime);
        System.out.println(findingSecondMax(ar2));
        System.out.println((System.currentTimeMillis() - stTime) + " milis.");
    }

    private static int findingSecondMax(int[] arr) { // 0 1 2
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int item : arr){
            if(item > max){
                secondMax = max;
                max = item;
            }
        }
        return secondMax;
    }
}
