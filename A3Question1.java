public class A3Question1 {
    public int id;
    public String name;
    public double mark;


    public A3Question1(int id,String name,double mark){  
        this.id=id;
        this.name=name;
        this.mark=mark;  
    }
    public void displayDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
    }
    public static void main(String[] args) {
        A3Question1 obj1 = new A3Question1(1,"guhan",86.00);
        A3Question1 obj2 = new A3Question1(2,"yuhan",96.00);
        A3Question1 obj3 = new A3Question1(3,"buhan",76.00);
        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();
    }   
}
