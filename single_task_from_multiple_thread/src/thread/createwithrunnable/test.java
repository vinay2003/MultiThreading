//2. Performing single task from multiple thread.

package thread.createwithrunnable;

public class test implements Runnable {

    public void run () {
        System.out.println("2. Performing single task from multiple thread.");
    }

    // public static void main is also thread it's create by jvm and i'm also adding this tread firstly
    public static void main (String[] args) {
        test t1 = new test();
        Thread th1 = new Thread(t1);    // 2 thread
        th1.start();

        test t2 = new test();
        Thread th2 = new Thread(t2);   // 3 thread
        th2.start();

        test t3 = new test();
        Thread th3 = new Thread(t3);  // 4 thread
        th3.start();
    }
}
