import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Day:");
        int day = sc.nextInt();
        switch (day){
            case(1):
                System.out.println("Monday");
                System.out.println("Week Day");
                break;

            case(2):
                System.out.println("Tuesday");
                System.out.println("Week Day");
                break;

            case(3):
                System.out.println("Wednesday");
                System.out.println("Week Day");
                break;

            case(4):
                System.out.println("Thursday");
                System.out.println("Week Day");
                break;

            case(5):
                System.out.println("Friday");
                System.out.println("Week Day");
                break;

            case(6):
                System.out.println("Saturday");
                System.out.println("Week End");
                break;

            case(7):
                System.out.println("Sunday");
                System.out.println("Week End");
                break;



        }

    }
}
