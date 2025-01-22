// Consider the class name BankAccount

import java.security.PublicKey;

public class A3Question4 {
private String accountNumber;  
private String accountHolderName;  
private double balance;

public String getaccountNumber(){
    return accountNumber;

}
public void setaccountNumber(String accountNumber){
    this.accountNumber = accountNumber;

}
public String getaccountHolderName(){
    return accountHolderName;

}
public void setaccountHolderName(String accountHolderName){
    this.accountHolderName = accountHolderName;

}
public double getbalance(){
    return balance;

}
public void setbalance(double balance){
    this.balance = balance;

}
public void deposit(double amount){
    balance+=amount;
    System.out.println("Deposited: " + amount);
    System.out.println("Total Balance: "+ balance);
}
public void withdraw(double amount){
    if(balance>=amount){
        balance-=amount;
        System.out.println("Withdraw amount: "+amount);
        System.out.println("Balance amount: "+balance);
    }
    else{
        System.out.println("Insufficient Balance");
    }
}
public static void main(String[] args) {
    A3Question4 obj = new A3Question4();
    obj.setaccountNumber("123456");
    obj.setaccountHolderName("Guhan");
    obj.setbalance(10000);
    System.out.println("Balance before Deposit:"+obj.getbalance());
    obj.deposit(15000);
    obj.withdraw(5000);
    obj.withdraw(25000);
}
    
}
