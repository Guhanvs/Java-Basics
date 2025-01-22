// Consider the class name as Vehicle
public class A3Question2 {
    String Brand;
    double Speed;
    public A3Question2(String Brand,double Speed){
        this.Brand=Brand;
        this.Speed=Speed;
    }
    public void displayInfo(){
        System.out.println("Brand : " + Brand );
        System.out.println("Speed : " + Speed );
    }

    public class Car extends A3Question2{
        String fueltype;
        public  Car(String Brand,double Speed,String fueltype){
            super(Brand,Speed);
            this.fueltype=fueltype;
        }
        public void displayCarDetails(){
            displayInfo();
            System.out.println("FuelType: " + fueltype);
        }

    }
    public static void main(String[] args) {
        A3Question2 obj = new A3Question2("Benz", 100.00);
        Car obj1 = obj.new Car("Benz",100.00,"Petrol");
        obj1.displayCarDetails();


    }
    
}
