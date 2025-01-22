// Consider class name as Shape

import org.w3c.dom.css.Rect;

public class A3Question3 {
    public double calculateArea(){
        return 0;
    }
    class Rectangle extends A3Question3 {
        int length;
        int breadth;
        public Rectangle(int length,int breadth){
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        public double calculateArea(){
            return length*breadth;


        }

    }
    class Circle extends A3Question3{
        double radius;
        public Circle(double radius){
            this.radius=radius;
        }
        @Override
        public double calculateArea(){
            return Math.PI * radius*radius;
        }


    }
    public static void main(String[] args) {
       A3Question3 obj = new A3Question3();
        Rectangle obj1 = obj.new Rectangle(10,20);
        Circle obj2 = obj.new Circle(10.00);
        System.out.println("Rectangle: " + obj1.calculateArea());
        System.out.println("Circle: "+obj2.calculateArea());

        
    }
    
}
