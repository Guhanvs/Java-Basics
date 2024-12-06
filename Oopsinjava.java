public class Oopsinjava {
    int a = 10;
    int b =20;

    public void sum(){
        System.out.println(a+b);

    }
    public void sub(){
        System.out.println(a-b);

    }
    public static void main(String args[]){
        Oopsinjava objects = new Oopsinjava();
        objects.sum();
        objects.sub();

    }
}
