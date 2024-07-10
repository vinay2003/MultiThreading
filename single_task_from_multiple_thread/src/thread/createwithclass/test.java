//2. Performing single task from multiple thread.

package thread.createwithclass;

public class test extends Thread {

    @Override
    public void run() {
        System.out.println("2. Performing single task from multiple thread.");
    }

    // public static void main is also thread it's create by jvm and i'm also adding this tread firstly
    public static void main(String[] args)  {
        test t1 = new test();     // 2 thread
        t1.start();

        test t2 = new test();    // 3 thread
        t2.start();

        test t3 = new test();    // 4 thread
        t3.start();
    }
}
