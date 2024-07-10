//1. Performing single task from single thread.

package thread.createwithrunnable;

public class test implements Runnable {

    public void run () {
        System.out.println("1. Performing single task from single thread.");
    }

    public static void main (String[] args) {
        test t1 = new test();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}
