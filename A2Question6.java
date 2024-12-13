import org.w3c.dom.css.Counter;

//Consider class name as Counter
public class A2Question6 {
    static int count=0;
    A2Question6(){
        count++;
    }

    public static void main(String[] args) {
        A2Question6 obj1 = new A2Question6();
//        obj1.count++;
//        System.out.println(obj1.count);
        A2Question6 obj2 = new A2Question6();
//        obj2.count++;
//        System.out.println(obj2.count);
        A2Question6 obj3 = new A2Question6();
//        obj3.count++;
//        System.out.println(obj3.count);
        System.out.println(A2Question6.count);
    }
}
