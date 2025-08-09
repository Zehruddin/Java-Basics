
enum Status                 // it is like a class, we use to define named constants in it
{
    Success, Running, Pending, Failure;
}

enum Laptop
{
    macBook(1000), XPS(800), thinkPad(500);            // these are objects

    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}


public class Enum {
    public static void main(String a[])
    {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());        // ordinal() return the index position of the constant it starts with 0
        
        Status ss[] = Status.values();        // values gets an array of constants
        System.out.println(ss[2]);

        for (Status x: ss)
        {
            System.out.println("Values : " + x + " position " + x.ordinal());
        }
        // using if statements with enum constants
        if (s == Status.Running)
            System.out.println("All good");
        else if (s == Status.Pending)
            System.out.println("Please wait");
        else if (s == Status.Failure)
            System.out.println("Try Again");
        else
            System.out.println("Done");
        // enum with switch statements
        switch(s)
        {
            case Running:       // no need of using enum Name it is set as enum type in switch clause
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Failure:
                System.out.println("try again");
                break;
            default:
                System.out.println("Done");

        }

        for (Laptop x : Laptop.values())
        {
            System.out.println("Laptop : " + x + "," + "Price : " + x.getPrice());
        }

    }
}
