package Assisted_Practice_Projects2;

public class Practice_Project02 {
    public static void main(String[] args) {
        // Sleep demo
        Thread sleepThread = new Thread(() -> {
            try {
                System.out.println("Sleep Thread started.");
                Thread.sleep(3000); // Sleep for 3 seconds
                System.out.println("Sleep Thread woke up after 3 seconds.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        sleepThread.start();

        // Wait demo
        Object lock = new Object();

        Thread waitThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Wait Thread started.");
                    lock.wait(); // Wait until notified
                    System.out.println("Wait Thread resumed.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        waitThread.start();

        // Notify the wait thread after 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock) {
            lock.notify();
        }
    }
}

