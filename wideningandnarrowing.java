public class wideningandnarrowing {
    public static void main(String[] args) {
        short num1 = 1000;
        int num2 = (int) num1;
        System.out.println(num2); //widening
        int num3 = 1000;
        short num4 = (short) num3; //Narrowing
    }
    
}
