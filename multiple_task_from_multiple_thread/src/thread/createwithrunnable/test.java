//4. Performing multiple tasks from multiple threads.

package thread.createwithrunnable;

class myThread1 implements Runnable {

    public void run () {
        System.out.println("1. Performing multiple tasks from multiple threads.");
    }
}

class myThread2 implements Runnable {

    public void run () {
        System.out.println("2. Performing multiple tasks from multiple threads.");
    }
}

class myThread3 implements Runnable {
    public void run () {
        System.out.println("3. Performing multiple tasks from multiple threads.");
    }
}


public class test {

    public static void main(String[] args) {

        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        myThread3 t3 = new myThread3();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
