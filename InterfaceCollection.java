import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class InterfaceCollection {
    public static void main(String args[])
    {
        Collection<Integer> nums = new ArrayList<Integer>();    // Collection is an interface so we are creating an object of ArrayList which implements it.
        nums.add(2);                // this creates an object not an integer
        nums.add(1);                // to make it integer we have to declare generics type as <Integer> or else it may lead to runtime errors
        nums.add(6);
        nums.add(5);
        System.out.println("Collections : "+nums);       // we can directly print a collection
        System.out.println("Collections");
        for (int n : nums)              // we dont have index in collection
        {
            System.out.println(n);
        }

        List<Integer> nums2 = new ArrayList<Integer>();     // if we want to work with index List is good
        nums2.add(10);
        nums2.add(11);
        nums2.add(12);
        nums2.add(10);          // List can have duplicated values
        System.out.println(nums2.get(1));       // returns the value based on index
        nums2.set(2, 55);       // we set elements with index and value
        System.out.println(nums2.get(2));
        System.out.println("Index of 55 : " + nums2.indexOf(55)); // we can get index value with indexOf()
        System.out.println("List");
        System.out.println("List : " + nums2);
        for (int n : nums2)
        {
            System.out.println(n);
        }
        
        // If you dont want duplicated you can go with Sets
        Set<Integer> nums3 = new HashSet<Integer>();     // Set is implemented by HashSet
        nums3.add(101);
        nums3.add(13);
        nums3.add(84);
        nums3.add(10);      // set wont take repeated value
        System.out.println("Hash set : " + nums3);
        System.out.println("Hash Set");
        for (int n : nums3)
        {
            System.out.println(n);
            // it prints in random order, no index value
        }
        
        // TreeSet is sorted it extends AbstractSet and implements NavigableSet which extends SortedSet
        
        // We can set reference to Set or Collection
        Collection<Integer> nums4 = new TreeSet<>();     // Set is implemented by HashSet
        nums4.add(21);
        nums4.add(11);
        nums4.add(18);
        nums4.add(55);
        nums4.add(10);      // TreeSet wont take repeated value
        System.out.println("Tree Set : " + nums4);
        // it will have elements in sorted order
        System.out.println("TreeSet");
        for (int n : nums4)
        {
            System.out.println(n);
            //  no index value
        }

        // Collection extends Iterable interface which has Iterator method

        Iterator<Integer> values =  nums4.iterator();
        System.out.println("Iterator : " + values.next());

        // we dont know how many values iterator has so we can use while loop
        // while has hasnext() method which executes until it has values
        System.out.println("Iterator entire values");
        while(values.hasNext())
            System.out.println(values.next());

        // Map is a part of collection relative API concept
        // a key - value pair
        System.out.println("Map concept: ");
        // Map is an  interface to implement it we need HashMap class
        Map<String, Integer> Students = new HashMap<String, Integer>();
        Students.put("Harsh", 90);      // we use put() to insert values
        Students.put("Navin", 80);
        Students.put("Rakesh", 87);
        Students.put("Rohit", 70);
        Students.put("Navin", 99);  // replaces or updates the existing key pair
        //keys are unique
        
        System.out.println("Maps with HashMap : " + Students);       // prints in no particular order
        System.out.println(Students.get("Rohit"));  // printing using key with get()
        
        System.out.println(Students.values()); // returns the values
        System.out.println(Students.keySet()); // returns the keys
        for(String key : Students.keySet())
        {
            System.out.println("Name : "+ key + ", Marks : " + Students.get(key));
        }
        
        // Hash Table
        // If you want to use synchoronized version you can use Hashtable i.e if you are using multiple threads
        Map<String, Integer> Students2 = new Hashtable<String, Integer>();
        Students2.put("Harsh", 90);      // we use put() to insert values
        Students2.put("Navin", 80);
        Students2.put("Rakesh", 87);
        Students2.put("Rohit", 70);
        Students2.put("Navin", 99);  // replaces or updates the existing key pair
        //keys are unique
        
        System.out.println("Maps with Hashtable : " + Students2);       // prints in no particular order
        System.out.println(Students2.get("Rohit"));  // printing using key with get()
        
        System.out.println(Students2.values()); // returns the values
        System.out.println(Students2.keySet()); // returns the keys
        for(String key : Students2.keySet())
        {
            System.out.println("Name : "+ key + ", Marks : " + Students2.get(key));
        }
    }
}
