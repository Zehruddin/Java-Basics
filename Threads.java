
class One extends Thread{
    public void run()                   // In every thread you need to have a run method
    {
        for (int i=0; i<11 ; i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);      // we can make the thread to wait using sleep() 
            } catch (InterruptedException e) { e.printStackTrace();  } 
        }
    }
}

class Two extends Thread{
    public void run()
    {
        for (int i=0; i<11 ; i++)
        {
            System.out.println("Hello");
             try{
                Thread.sleep(10);      // we can make the thread to wait using sleep() 
            } catch (InterruptedException e) { e.printStackTrace();  } 
        }
    }
}
class Three implements Runnable{
    public void run()
    {
        for (int i=0; i<11 ; i++)
        {
            System.out.println("Hi");
             try{
                Thread.sleep(10);      // we can make the thread to wait using sleep() 
            } catch (InterruptedException e) { e.printStackTrace();  } 
        }
    }
}
class Four implements Runnable{
    public void run()
    {
        for (int i=0; i<11 ; i++)
        {
            System.out.println("Hello");
             try{
                Thread.sleep(10);      // we can make the thread to wait using sleep() 
            } catch (InterruptedException e) { e.printStackTrace();  } 
        }
    }
}

class Counter
{
    int count;
    public synchronized void increment(){   // synchronized make sure this mehtod is called only once at a time
        count++;
    }
}

public class Threads {
    public static void main(String args[]) throws InterruptedException // exception is because of join()
    {
        One obj1 = new One();
        Two obj2 = new Two();
        System.out.println(obj1.getPriority());     // tells the priority of the thread
        obj2.setPriority(Thread.MAX_PRIORITY);
        // obj1.start();
        // obj2.start();

        Runnable obj3 = new Three();    // we can create reference type with class object
        Runnable obj4 = new Four();
        Thread t1 = new Thread(obj3);   // we have to create a thread object and pass a runnable obj3     
        Thread t2 = new Thread(obj4);   // as the Thread has no idea about the class as we implement runnable

        // t1.start();
        // t2.start();

        // anonymous class
        Runnable obj5 = new Runnable() {
            public void run()
            {
                for (int i=0; i<11 ; i++)
                {
                    System.out.println("Bye");
                    try{
                        Thread.sleep(10);      // we can make the thread to wait using sleep() 
                    } catch (InterruptedException e) { e.printStackTrace();  } 
                }
            }
        };
        Thread t3 = new Thread(obj5);
        // t3.start();

        // lambda expression as Runnable is functional interface

        Runnable obj6 = () -> {
            for (int i=0; i<11 ; i++)
                {
                    System.out.println("Welcome");
                    try{
                        Thread.sleep(10);
                    } catch (InterruptedException e) { e.printStackTrace();  } 
                }
        };
        Thread t4 = new Thread(obj6);
        // t4.start();


        // Thread safe
        Counter c = new Counter();
        Runnable obj7 = () -> {
            for (int i=0; i<=1000 ; i++)
                {
                   c.increment();
                }
        };
        
        Runnable obj8 = () -> {
            for (int i=0; i<=1000 ; i++)
            {
                c.increment();
            }
        };

        Thread t5 = new Thread(obj7);
        Thread t6 = new Thread(obj8);
        t5.start();
        t6.start();
        t5.join();
        t6.join();

        System.out.println("Increment count : " + c.count);
    }
}
