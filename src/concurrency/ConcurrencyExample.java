/**
 * Create by saurabh
 * Date: 08/02/24
 * Project Name: Java-8
 */
package concurrency;

import java.util.concurrent.CountDownLatch;

public class ConcurrencyExample {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Runnable runnableTask = () -> {
            System.out.println("Count Down Example");
            countDownLatch.countDown();
        };
        Thread thread1 = new Thread(runnableTask,"thread1");
        Thread thread2 = new Thread(runnableTask,"thread2");
        Thread thread3 = new Thread(runnableTask,"thread3");
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            countDownLatch.await();
            System.out.println("Main thread start here after all thread complited");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
