import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int Number = sc.nextInt();
        if(Number < 0){
            System.out.println("Negative Number");

        }
        else if (Number ==0) {
            System.out.println("Zero");

        }
        else{
            System.out.println("Positive Number");
        }
    }

}
