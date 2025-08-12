
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class UserInputBuffer extends 
{
    public void input() throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());     // raedLine() takes string input
        System.out.println(num);
        bf.close();     //BufferedReader is a resource so it is always a better practice to close but not mandatory 
    }
}
class EnhancedFinally
{
    public void enhancedFinally() throws IOException
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))   // this will automatically clase the resource i.e. br here
    {
        int num = Integer.parseInt(br.readLine());
        System.out.println(num);
    }}
}
class UserInputScanner
{
    public void input(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);
    }
}

public class UserInput {
    public static void main(String s[]) throws IOException
    {
        System.out.println("Enter a number : ");
        // int n = System.in.read();   // this returns int ASCII value of input and need to handle IOException (checked exception)
        // System.out.println(n - 48); // works for single character

        // UserInputBuffer obj1 = new UserInputBuffer();
        // obj1.input();
        UserInputScanner obj2 = new UserInputScanner();
        obj2.input();   
    }
}

