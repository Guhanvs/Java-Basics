import java.io.*;
public class Question6{
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }

    public static void main(String[] args) {
        String s = "leveL";
        boolean rev = isPalindrome(s);
        if(rev) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
    }
    }
}

