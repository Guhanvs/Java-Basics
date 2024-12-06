import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter a number:");
        int b = sc.nextInt();
        System.out.println("Choose a operator(+,-,*,%,/):");
        char operation = sc.next().charAt(0);
        switch(operation){
            case('+'):
            int sum = a+b;
            System.out.println(sum);
            break;
            case('-'):
            int sub = a-b;
            System.out.println(sub);
            break;

        }

 
    }
}