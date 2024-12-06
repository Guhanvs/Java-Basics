import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println("Number of Words:" + words.length);
        System.out.println("Reversed words:");
        for (String word : words) {
            System.out.println(new StringBuilder(word).reverse().toString());

        }
        sc.close();

    }
}
