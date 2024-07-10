//4. Performing multiple tasks from multiple threads.

package thread.createwithclass;

class myThread extends Thread {

    public void run () {
        System.out.println("1. Performing multiple tasks from multiple threads.");
    }
}

class myThread1 extends Thread {

    public void run () {
        System.out.println("2. Performing multiple tasks from multiple threads.");
    }
}

class myThread2 extends Thread {
    public void run () {
        System.out.println("3. Performing multiple tasks from multiple threads.");
    }
}


public class test {

    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread1 t2 = new myThread1();
        myThread2 t3 = new myThread2();

        t1.start();
        t2.start();
        t3.start();
    }

}