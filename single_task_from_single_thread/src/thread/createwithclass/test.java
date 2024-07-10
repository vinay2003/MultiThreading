//1. Performing single task from single thread.

package thread.createwithclass;

public class test extends Thread {

    public void run () {
        System.out.println("1. Performing single task from single thread.");
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.start();
    }

}
