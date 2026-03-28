public class nan1 {
    public static String reverseIfPalindrome(String s) {

        String reversed = "";


        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        
        if (s.equals(reversed)) {
            return reversed;
        } else {
            return s;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverseIfPalindrome("madam"));
        System.out.println(reverseIfPalindrome("hello"));
    }
}
