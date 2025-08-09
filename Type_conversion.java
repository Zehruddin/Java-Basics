public class Type_conversion {
    public static void main(String s[]){
        byte a = 127;
        int b = a; // Implicit type conversion
        System.out.println(b);

        int c = 12;
        byte d = (byte) c; // Explicit type conversion
        System.out.println(d);

        int e=257;
        byte f=(byte)e; // It will do modulus 257(interger_value)%127(max byte length) = 1 and returns 1
        System.out.println(f);

        float g = 5.6f;
        int h = (int) g;
        System.out.println(h);

        // Type promotion

        byte b1 = 10;
        byte b2 = 30;
        int b3= b1 * b2;
        System.out.println(b3);

        // Upcasting and Downcasting

        A obj = (A) new B();    // The object of child B with reference of parent A casted up

        obj.show1();

        B obj2 = (B) obj;       // The reference of type parent is downcasted to child
        obj2.show1();
        obj2.show2();


    }
}
class A{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2()
    {
        System.out.println("in B show");
    }
}