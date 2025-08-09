abstract class Car{
    public abstract void drive();
    public abstract void parts();


    public void music()
    {
        System.out.println("Play music");
    }
}

abstract class WagonR extends Car{      // making this abstract because we are not defining all abstract methods of parent 
    public void drive()             // the extended class should have to define the abstract method
    {
        System.out.println("Driving");
    }
}

class UpdatedWaganR extends WagonR          // concrete class 
{
    public void parts()             
    {

    }
}


class Outer
{
    String name;

    public static void outerMethod()
    {
        System.out.println("Outer class method");
    }
    
    class Inner
    {
        int age;
        public void innerMethod()
        {
            System.out.println("Inner class method");
        }
    }
    static class staticInner                                    // static class
    {
        int age;
        public void innerMethod()
        {
            System.out.println("Inner class method");
        }
    }
}

class Anonymous
{
    public void method()
    {
        System.out.println("Normal class method");
    }
}
abstract class abstractAnonymous
{
    public abstract void method1();
    public abstract void method2();
}

public class Abstract {
    public static void main(String args[])
    {
       // Car obj =  new Car();         // cannot create object for an abstract class

       Car obj = new UpdatedWaganR();          // but can create as reference type


       Outer a = new Outer();               // Outer class object

       Outer.Inner b = a.new Inner();     //   for Inner class object you have to use outer class object

       Outer.staticInner c = new Outer.staticInner();

       a.outerMethod();
       b.innerMethod();


       Anonymous an = new Anonymous()                       // Here we are creating object for abstract class which we can't with normal cases
       {                                                        // changing the method() using anonymous inner class
        // this "an" is not a object of absract "Anonymous" class, it as object of the below anonymous inner class
            public void method()
            {
                System.out.println("Anonymous inner class overriding");
            }
       };
       an.method();

       abstractAnonymous aA = new abstractAnonymous(){
            public void method1()
            {
                System.out.println("Anonymous inner class to implement abstract method for abstract class method 1");
            }
            public void method2()
            {
                System.out.println("Anonymous inner class to implement abstract method for abstract class method 2");
            }
       };
       aA.method1();
       aA.method2();


    }    
}
