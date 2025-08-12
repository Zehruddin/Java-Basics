import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String args[])
    {
        List<Integer> l1 = Arrays.asList(4,5,7,3,2,6);     // Arrarys class has asList() to get values
        // to print sum of double of even numbers in the List
        int sum = 0;
        for (int n : l1){
            if( n % 2 == 0){
            n = n * 2;
            sum = sum + n;}
        }
        System.out.println(sum);

        for (int i=0; i<l1.size(); i++){        // size() method gives the length of the list
            System.out.println(l1.get(i));
        }

        // Consumer is a FunctionalInterface so we can implement as lambda expression
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {     // this acceptor will accept a number
                System.out.println(n);
            }
            
        };
        // consumer as lambda expression
        Consumer<Integer> con1 = n -> System.out.println(n);
         
        l1.forEach(con1);
        // instead of implementing a Consumer interface we can use lambda expression inside forEach
        l1.forEach(n -> System.out.println(n)); // forEach is a part of List interface



        // Stream is an interface
        System.out.println("Stream");
        Stream<Integer> s1 = l1.stream();    // stream() -> returns the object of Stream 
        // with this s1 Stream we can perform any operation that is not gonna affect l1 List
        // once you have worked with the stream you can't reuse it
        Stream<Integer> s2 = s1.filter(n -> n%2==0);     // filters the even numbers from s1
        // s1.forEach(n -> System.out.println("Stream value : " + n));
        // s1.forEach(n -> System.out.println("Stream value : " + n));
        // we cant run the above line again
        Stream<Integer> s3 = s2.map(n -> n*2);   // doubling and mapping the value in s3 using map()

        int result = s3.reduce(0, (c,e) -> c+e);    // reduce the result the datatype value of our usage
        // s3.forEach(n -> System.out.println(n)); 
        System.out.println("Result : " + result);
        
        // the streams can be done in single line
        
        int result2= l1.stream()
        .filter(n -> n%2==0)
        .map(n -> n * 2)
        .reduce(0,(c,e) -> c+e);
        
        System.out.println("Result 2  : " + result2);

        // filter() -> it takes Predicate which has test()
        // It is a Functional Interface so labmda expression is possible
        Predicate<Integer> p1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t%2==0;
            }
            
        };
        //lambda version
        Predicate<Integer> p2 = t -> t%2==0;
    
        // map() ->it takes Function which is a functional interface and has apply()

        Function<Integer, Integer> f1 = new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * 2;
            }            
        };
        // lmbda version
        Function<Integer, Integer> f2 = n -> n * 2;


        int result3= l1.stream()
        .filter(p2)  // here we are passing the predicate          
        .map(f2)     // here we are passing the function
        .reduce(0,(c,e) -> c+e);
        
        System.out.println("Result 3  : " + result3);

        Stream<Integer> sortedStream = l1.stream()
                                        .filter(n -> n%2==0)
                                        .sorted();
        System.out.println("Sorted Stream");
        sortedStream.forEach(n -> System.out.println(n));
        // If you want to not sort but filter you can you use l1.parallelStream() which is multithreading
        
    }
}
