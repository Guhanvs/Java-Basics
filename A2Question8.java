//Consider class name as Employee
public class A2Question8 {
    String name;
    double salary;
    public A2Question8(){
        name="Guhan";
        salary=10000.000;
        System.out.println("Default Name of the Employee "+name+" And his Salary is "+salary);
    }
    public A2Question8(String name,double salary){
        System.out.println("Parameterized Name of the Employee "+name+" And his Salary is "+salary);

    }

    public static void main(String[] args) {
        A2Question8 obj = new A2Question8();
        A2Question8 obj1 = new A2Question8("Guhan",10000);
    }
}
