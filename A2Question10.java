//Consider class name as BankAccount
import java.util.Scanner;
public class A2Question10 {
    int accountNumber=11121;
    double balance=0;
    public double deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter th account number: ");
        int accountNumber1 = sc.nextInt();
        if (accountNumber == accountNumber1) {
            System.out.print("Enter the amount to deposit: ");
            double amount = sc.nextDouble();
            if (amount > 0) {
                balance += amount;
//                System.out.println("Balance amount in Account Number " +accountNumber+" is "+balance);
            } else {
                System.out.println("Invalid Deposit");
            }

        }
        else{
            System.out.println("Invalid Account Number");
        }
        return balance;
    }


    public static void main(String[] args) {
        A2Question10 obj = new A2Question10();
        System.out.print(obj.deposit());
//        System.out.println(obj.balance);
    }
}
