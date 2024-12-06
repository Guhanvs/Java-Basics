//constructor
//without super keyword
class Constructor {
    Constructor()
    {//Without super key word but it will be considered as super
        System.out.println("Base Constructor will be called");
    }
}
class Derived extends Constructor{
    Derived() 
    { //Without super keyword it will be considered as sub 
        System.out.println("Derived Constructor will be Called");
    }


}
class Base{
    public static void main(String[] args){
        Derived d = new Derived();
    }
}
