public class Operators {
    public static void main(String[] args) {

        // Arithmetic operators : +, -, *, /, ++, --

        // pre - increment
        int a = 10;
        int result1 = ++a; // It will increment first and then assign the value op: 11
        System.out.println(result1);

        // post - increment
        int b = 10;
        int result2 = b++; // It will assign first and then increment op: 10
        System.out.println(result2); 
        System.out.println(result2); 

        // Relational operators : <, >, ==, !=, <=, >=m

        // Logical operators : & -> AND, | -> OR, ! -> NOT Short circuit : &&, ||

        // ternary operator
        int b1 = 4;
        int result = b1 % 2 == 0 ? 3 : 4;
        System.out.println(result);

        int i = 1;
        while (i <= 4) {
            System.out.println("Hello"+ i);
            i++;
        }

    }
}
