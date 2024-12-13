//Consider class name as car
public class A2Question5 {
    static String brand;
    String model;
    int year;

    public static void main(String[] args) {
        A2Question5 obj1 = new A2Question5();
        obj1.model = "Swift";
        obj1.year =1996;
        brand="Suzuki";
        System.out.println(brand);
        System.out.println(obj1.model);
        System.out.println(obj1.year);
        A2Question5 obj2 = new A2Question5();
        brand="maruthi";
        System.out.println(brand);
        obj2.model="Dzire";
        System.out.println(obj2.model);
        obj2.year=1995;
        System.out.println(obj2.year);



    }
}
