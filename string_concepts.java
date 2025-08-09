public class string_concepts {
    public static void main(String srgs[])
    {
        String s1 = new String("This is a string");
        String s2 = "second String";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println("hello : " + s1); // concatenation of string
        System.out.println(s1.charAt(3)); // accessing a specic character
        System.out.println(s1.concat(" with concated words"));

        String name  = "Navin";
        name = name + "reddy";
        System.out.println(name); // here we are not actually modifying but it print both names

        // Mutable String -> String Buffer and String builders

        System.out.println("String Buffer");

        StringBuffer bf1 = new StringBuffer();
        System.out.println(bf1.capacity()); // By defaultly it has capacity 16
        
        StringBuffer bf2 = new StringBuffer("Hello");
        System.out.println(bf2.capacity()); // It returns 21 now

        System.out.println("Length of the bf2 string buffer : " + bf2.length());

        bf2.append(" Java");
        String str = bf2.toString(); // Converts string buffer to string

        bf2.deleteCharAt(2); // deletes data of string in given index

        bf2.insert(0, "java");
        System.out.println(bf2);
        


        
    }
}
