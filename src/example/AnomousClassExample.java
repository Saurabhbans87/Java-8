/**
 * Create by saurabh
 * Date: 28/03/24
 * Project Name: Java-8
 */
package example;

public class AnomousClassExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                System.out.println("HI");
            }
        };
        thread1.start();

        //using lambda
        Runnable runnable = ()-> System.out.println("hello");
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
