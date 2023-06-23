package Assisted_Practice_Projects2;

// Thread by extending Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread created by extending Thread class");
    }
}

// Thread by implementing Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread created by implementing Runnable interface");
    }
}

public class Practice_Project01 {
    public static void main(String[] args) {
        // Creating and starting thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Creating and starting thread by implementing Runnable interface
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
