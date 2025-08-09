

class Computer
{
    public void show()
    {
        System.out.println("in Computer show");
    }
}
class Laptop extends Computer
{
    public void show()
    {
        System.out.println("in Laptop show");
    }
    
}
class Tablet extends Computer{      // Heirarchial inheritance 
    public void show()
    {
        System.out.println("in Tablet show");
    }    
}


public class Polymorphism {
    public static void main(String a[])
    {
        Computer com = new Laptop();    // this is valid referring with parent and creating object for child class
        // this will work only if parent - child relationship is involved
        com.show();         // as per method overriding it will child show() method
        
        com = new Computer();   // we can use the same reference variable for different object creation

        com.show();         // This will call parent show() method

        com = new Tablet();

        com.show();         // this will call 2nd child show() method


        final int CON = 10;     // declaring a constant using final keyword

        System.out.println(CON);


    } 
}

final class FinalClass              // cannot be inherited
{

}