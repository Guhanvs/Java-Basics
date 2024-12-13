//Consider class name as circle
public class A2Question9 {
    int radius;
    public double calculateCircumference(int radius){
        double pi = 3.14;
        double circumference = 2*pi*radius;
        return circumference;


    }

    public static void main(String[] args) {
        A2Question9 obj = new A2Question9();
        System.out.println(obj.calculateCircumference(7));
    }
}
