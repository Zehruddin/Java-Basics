package DB;

public class Db {
    public static void main(String[] args) {
        System.out.println("This is the file db inside DB package");
        Calculator obj = new Calculator();
    }
}
class Calculator
{
    public void add()
    {
        System.out.println("This is add method inside SUB DB folder");
    }
}