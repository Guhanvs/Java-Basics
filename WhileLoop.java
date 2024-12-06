import java.awt.desktop.SystemSleepListener;
//while Loop and Do While Loop
public class WhileLoop {
    public static void main(String[] args) {
        short number = 1;
        while(number<11){
            System.out.print(number+"\t");
            number++;
        }
        short numbers = 0;
        do{
            System.out.println("\n"+numbers);
            numbers++;
        }
        while(numbers<11);
    }
}
