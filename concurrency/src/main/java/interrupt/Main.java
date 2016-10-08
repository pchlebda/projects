package interrupt;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Piotr on 17.09.2016.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Runnable runnable = new InterruptTask(queue);

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(50);
        thread.interrupt();
        Thread.sleep(50);
        System.out.println("Is interrupted : "+thread.isInterrupted());


    }
}
