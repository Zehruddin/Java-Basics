class MyException extends Exception         // we can create our own exception by extending Exception super class
{
    public MyException(String str)
    {
        super(str);
    }
}

public class Exceptions {
    public static void main(String s[])
    {
        int i = 2;
        int j = 0;
        String str = null;
        int a[] = new int[5];

        
        try
        {
            j = 10 / i;
            // System.out.println(str.length());
            throw new MyException("This is an thrown exception"); // we are throwing the expeption explicity which will be catched by th catch block
            // System.out.println(a[5]);
        }
        catch(MyException e)
        {
            System.out.println("This is user defined exception " + e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Dont divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay within your array limit");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong : " + e);
        }

        System.out.println("Printing after the exception block");
    }
}
