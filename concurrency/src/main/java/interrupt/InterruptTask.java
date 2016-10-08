package interrupt;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Piotr on 17.09.2016.
 */
public class InterruptTask implements Runnable {

    private final BlockingQueue<Integer> queue;

    public InterruptTask(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println("Waiting for take");
            queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }
}
