
// class - class -> extends
// class - interface -> implements
// interface - interface -> extends


interface Interf1{               // if we are gonna use only abstarct method inside a class we can go for interface
    public abstract void method1();         
    void method2();             // by default methods in a interface are public and abstract

    int age = 10;                    // all the variables are final and static by default
    String name = "Shah";                // if final we have to initialize the variables and can be directly used with interface name
}
interface Interf2
{
    void method3();
}
interface Interf3 extends Interf2              // Inheritance is possible in interfaces it can extend another interface
{
    // this has its parents abstract methods
}

class Class2 implements Interf1, Interf3{             // this has to implement all the abstarct methods or else it should become an abstract class
                                            // can implement multiple interfaces but have to implement all abstract methods
                                            // here Interf3 has Interf2 abstract method so it need to be implemented

    @Override
    public void method1() {
        System.out.println("Method 1 Implementation");
    }
    
    @Override
    public void method2() {
        System.out.println("Method 2 Implementation");
    }      
    
    public void method3()
    {
     System.out.println("Mthod 3 Implementation");   
    }
    

}

public class Interface {
    public static void main(String a[])
    {
        Interf1 i1;          // we can create a reference of Interface type but not object
        i1 = new Class2();  // we can create object for implementing class

        i1.method1();
        i1.method2();

        Interf2 i2 = new Class2(); 
        i2.method3();

        System.out.println("Name : " + Interf1.name + " Age : " + Interf1.age);
    }
}
