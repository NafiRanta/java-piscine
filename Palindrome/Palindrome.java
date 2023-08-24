public class Palindrome {
    public static boolean isPalindrome(String s) {
        // your code here
        if (s == null){
            return false;
        }

        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        //ressasser
        boolean same = false;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}