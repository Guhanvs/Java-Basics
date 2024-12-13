//Consider class name as Rectangle
public class A2Question4 {
    int width;
    int length;
    public int calculateArea(int width,int length){
        int area = length*width;

        return area;


    }

    public static void main(String[] args) {
        A2Question4 obj = new A2Question4();
        System.out.println(obj.calculateArea(10,20));

    }
}
