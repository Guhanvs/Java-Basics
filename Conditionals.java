import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Integer for a:");
    int a = sc.nextInt();
    System.out.print("Enter a Integer for b:");
    int b = sc.nextInt();
    if(a+b == 20){
        System.out.println("a + b = 20");
    }
    else if(a+b != 20 ){
        System.out.println("a + b not equal to 20");
    }
    else{
        System.out.println("a = 5 and b = 15");
    }
}
}
