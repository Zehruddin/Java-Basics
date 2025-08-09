class A             // Every class in java extends Object class
{
    public A()
    {   
        super();                            // every constructor has super even it is not mentioned
        System.out.println("in A");
    }
    public A(int a)
    {
        super();
        System.out.println("in A int");
    }
    public void show()
    {
        System.out.println("in A show method");
    }
}
class B extends A
{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        this();             // this() calls the constructor of the same class and the super class
        // super();                                // calls the constructor of super class
        // to call parameterized constructor of super class use "super(n)"
        System.out.println("in B int");
    }
    public void show()                                  // method over-riding
    {
        System.out.println("in B show method");
    }
}


class Calc{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}
class AdvCalc extends Calc{                                 // Single inheritance
    public int mul(int n1, int n2)
    {
        return n1 * n2;
    }
    public int div(int n1, int n2)
    {
        return n1 / n2;
    }
}
class VeryAdvCalc extends AdvCalc{                          // Multi-level inheritance
    public double power(int n1, int n2)
    {
        return Math.pow(n1, n2);
    }
}



public class inheritance {
 public static void main(String a[]){
    B b1 = new B(2);                    // prints parameterized B contructor and default of A

    B b2;                               // creating reference
    b2 = new B();                       // creating object

    new B();                        // Anonymous object     // when you have reference you call it reference object
    new B().show();                 // you can call method but cannot reuse the object if so done it'll create a new object

    VeryAdvCalc v1 = new VeryAdvCalc();
    
    System.out.println("Addition : " + v1.add(3,3));
    System.out.println("Subtraction : " + v1.sub(3,3));
    System.out.println("Multiplication : " + v1.mul(3,3));
    System.out.println("Division : " + v1.div(3,3));
    System.out.println("Power : " + v1.power(3,3));
}   
}

