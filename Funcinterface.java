class Annotations
{
    public void annot()
    {
        System.out.println("This method is to be overridden");
    }
}
class AnnotChild extends Annotations
{
    @Override                   // Annotations are supplement for complier or to run-time. It is to prevent bugs (Logical errors)
    public void annot()
    {
        System.out.println("Subclass overrides the super class method");
    }
}

@FunctionalInterface
interface FuncInterface             // An interface with only one method
{
    void method1(int i);            // also known as SAM (Single Abstract Method)
}
interface FuncInterface2
{
    String method(int i, String j);
}
interface MarkerInterface
{
    // An interface with no methods is known as marker interface
    // We can do serialization and deserialization using it
}

public class Funcinterface {
    public static void main(String args[])
    {
        FuncInterface f1 = (i) -> System.out.println("This is lambda expression wiht " + i + " one parameter");
        // lambda expression can be used with functional interface to reduce the syntactical code
        // No need to explicitly defining the object and method name instead use -> 
        // If it accepects parameter we can mention it with or without datatype
        f1.method1(10);

        FuncInterface2 f2 = (a ,b)  -> a+" "+b ; // here no need to mention return
        System.out.println(f2.method(10, "Hell"));
    }
}