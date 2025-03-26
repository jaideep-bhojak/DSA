package String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "why";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        while (start < end){
            if(charArr[start] != charArr[end]){
                return false;
            }
            start++;
            end--;  
        }
        return true;
    }
}
