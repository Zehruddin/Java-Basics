
class Mobile
{
    int price;
    static String name; // static variable
    String brand;

    public Mobile()             // this constructor is called and initialized whenver objects are created
    {
        price = 12;
        brand = "br";
        System.out.println("Constructor");
    }

    static {                    // this static block is called only once and first beacause the class
                                // loads first and then objects are created
        
        name = "Phone";
        System.out.println("Static block");
    }

    public void show()
    {
        System.out.println("This is show method");
    }

    public static void show1(){     // static method
        System.out.println("Static method, static variable : "+ name);  
        // can use static variable but not non-static or instance variables

    }

    public static void show2(Mobile obj){       // static method with object parameter to access non-static instance variables
        System.out.println("Printing non-static variables in static method  : " + obj.price + "," + obj.brand);
    }
}

class Human
{
    int age;
    String name;
    public Human()                              // default or normal constructor
    {
        age = 11;
        name = "Shah";
    }
    public Human(int age, String name)          // parameterized constructor
    {
        this.age = age;
        this.name = name;
    }
}
    
public class constructor {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();
        obj1.show();
        Class.forName("Mobile"); // this method loads the class even when no object is created
        System.out.println(Mobile.name); 
        
        Mobile.show1();  // static methods can be directly called using class names aswell
        Mobile.show2(obj1);

        Human h1 = new Human();
        System.out.println(h1.name+ " : " + h1.age);
        Human h2 = new Human(33,"RUkh");
        System.out.println(h2.name+ " : " + h2.age);
    }
}