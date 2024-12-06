public class StringMethods {
    public static void main(String[] args) {
        String name = "Ednue Tech Pvt Ltd";
        String ucName = name.toUpperCase();
        System.out.println(ucName);//UpperCase
        String lcName = name.toLowerCase();
        System.out.println(lcName);//LowerCase
        System.out.println(lcName.indexOf("tech"));//Index
        //Concatenation
        String name1 = "Ednue";
        String name2 = "Tech";
        String result = name1 + " " + name2;//concatenation
        System.out.println(result);
        String result2 = name1.concat(result);//concat()
        System.out.println(result2);
        int a =10;
        int b = 20;
        int sum = a+b;
        String text = "50";
        System.out.println(sum);
        System.out.println(text+ a);
        System.out.println(a + text);
    }
    
}
