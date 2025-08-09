// Object has something (Properties) and does something (Behaviour)


package OOPS;

public class oops {
    public static void main(String args[]){
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println("Result of add method from Calculator class: " + result);

        // Data area

        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        System.out.println(obj1.num); // prints 10
        System.out.println(obj2.num); // prints 10
        
        obj1.num = 8;
        System.out.println(obj1.num); // prints 8
        System.out.println(obj2.num); // prints 10 because it changes only the other object

        // Arrays

        int arr1[] = {1,2,3,4};
        int arr2[] = new int[4]; // will have values '0' as not defined

        arr2[1] = 23; // assigning value to an array at index 1 -> '2nd' position 

        for(int i=0; i<4; i++)
        {
            System.out.println(arr1[i]);
        }
        for(int i=0; i<4; i++)
        {
            System.out.println(arr2[i]);
        }

        // Multi-dimensional arrays
        System.out.println("Multi Dimensional Array");

        int mularr[] [] = new int [4] [4];

        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                mularr[i][j] = (int)(Math.random() * 10); // random is a method of class Math which returns random decimal value
                System.out.print((int)mularr[i][j] + " ");
            }
            System.out.println();
        }
        // Above same code with enhanced for loop
        System.out.println("Enhanced for loop");
        for (int i[] : mularr)
        {
            for (int j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Jagged arrays
        System.out.println("Jagged arrays");
        int jag [][] = new int [3][];
        jag[0] = new int [3];
        jag[1] = new int [4];
        jag[2] = new int [2];

        for(int i=0; i<jag.length; i++)
        {
            for (int j=0; j<jag[i].length; j++)
            {
                jag[i][j] = (int)(Math.random() * 10);
                System.out.print(jag[i][j] +  " ");
            }
            System.out.println();
        } 


        // Array of objects
        System.out.println("Array of objects");
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Name 1";
        s1.marks = 11;
        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Name 2";
        s2.marks = 22;
        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Name 3";
        s3.marks = 33;
        
        Student stu[] = new Student[3]; // Array of object for Student class
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        for(int i=0; i<stu.length; i++)
        {
            System.out.println("Name : " + stu[i].name);
        }
        for(Student i : stu)
        {
            System.out.println(i.name + " : " + i.marks);
        }


        // encapsulation and getters - setters
        Getters_and_Setters obj = new Getters_and_Setters();
        System.out.println("Accessing private variable using methods : " + obj.getAge() + " and " + obj.getName());
        obj.setAge(22);
        obj.setName(("Zehruddin"));
        System.out.println("Accessing private variable using methods after setting : " + obj.getAge() + " and " + obj.getName());
        
    }
}

class Calculator
{
    int num = 10;
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

class Student
{
    int roll;
    String name;
    int marks;
}

class Getters_and_Setters {
    private int age = 11;        // private keyword makes the variable only accessed within the class
    private String name = "Mohamed";
    private String address;

    public void setAge(int x)
    {
        age = x;
    }
    public void setName(String y)
    {
        name = y;
    }

    public int getAge()
    {
        return age;         // Making use of methods to access private variables
    }
    public String getName()
    {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
