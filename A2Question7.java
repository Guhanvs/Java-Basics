//Consider class name as Student
public class A2Question7 {
    String text;
    public A2Question7(String name,int rollNumber){
        text = "My Name is " + name + " and roll Number is " + rollNumber;
    }

    public static void main(String[] args) {
        A2Question7 obj = new A2Question7("Guhan",14);
        System.out.println(obj.text);
    }
}
