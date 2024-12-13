public class A2Question2 {
    public static void isPalindrome(String word){
        String reversed = new StringBuilder(word).reverse().toString();
        if(word.equalsIgnoreCase(reversed)){
            System.out.println("Given Word is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }

    public static void main(String[] args) {
        isPalindrome("Radar");
    }
}
