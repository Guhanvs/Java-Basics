import java.util.Scanner;

public class A2Question1 {
    public static void calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;}

            System.out.println("Factorial of " +number+" is " +factorial);



    }
        public static void main(String args[]){
        calculateFactorial(5);



    }
}
