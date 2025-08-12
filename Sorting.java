
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
    int age;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}

class Student2 implements Comparable<Student2>
{
    int age;
    String name;

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student2 that) {
        if (this.age > that.age)            // we are comparing within the class so we are using 'this' keyword
            return 1;
        else
            return -1;
    }
    
}

public class Sorting {
    public static void main(String a[])
    {
        List<Integer> l1 = new ArrayList<>();   // Defining the generic type on left side is enough
        l1.add(23);
        l1.add(55);
        l1.add(16);
        l1.add(51);
        Collections.sort(l1);           // Collections is an utility class which has a sort method
        System.out.println("Sorted List : " + l1);
        
        System.out.println("Sorting based on last digit");
        // here we can use sort method with a comparator  
        // Comparator is a concept or interface using which we can specify our own code logic for sorting   
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){               // we have to give it as Integer because of wrapper class name
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> l2 = new ArrayList<>();
        l2.add(25); 
        l2.add(31); 
        l2.add(72); 
        l2.add(43); 
        Collections.sort(l2,com);           
        // why we are mentioning comparator here and not for Integer is, it implements Comparable inteface
        System.out.println("Sorting based on last digit : " + l2);

        // List of type class here "Student1"
        List<Student1> stud = new ArrayList<>();
        stud.add(new Student1(61, "Harish"));
        stud.add(new Student1(21, "Rakesh"));
        stud.add(new Student1(10, "Ramesh"));
        stud.add(new Student1(11, "Suresh"));

        System.out.println("Student class list");
        System.out.println(stud);

        for (Student1 i : stud) {
            System.out.println(i);
        }

        // we have to sort with respect to their age here we are gonna use Comparator

        Comparator<Student1> c1 = new Comparator<Student1>() {
            public int compare(Student1 i, Student1 j){
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(stud, c1);

        System.out.println("Sorted with respect to their age : " + stud);

        // Sorting the class with Comparable implementation methods   
        // List of type class here "Student2"
        List<Student2> stud2 = new ArrayList<>();
        stud2.add(new Student2(61, "Harish"));
        stud2.add(new Student2(21, "Rakesh"));
        stud2.add(new Student2(10, "Ramesh"));
        stud2.add(new Student2(11, "Suresh"));

        System.out.println("Student class list");
        System.out.println(stud2);

        for (Student2 i : stud2) {
            System.out.println(i);
        }


        // Comparator is a functional interface so we can use lambda expression
        Comparator<Student2> c2 = (i, j) -> i.age > j.age ? 1 : -1;     // ternary operator (return is not used because lambda expression)

        // Collections.sort(stud2);     //this also works as we have implemented the Comparable compareTo() method
        Collections.sort(stud2, c2);    // this too works as we defined the logic as lambda expression

        System.out.println("Sorted with respect to their age by implementing Comparable interface: " + stud2);

    }
}
