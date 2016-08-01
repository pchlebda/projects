package producer.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Piotr on 01.08.2016.
 */
public class ProducerConsumerPattern {

    public static void main(String[] args) {

        BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(new Producer(sharedQueue));
        Thread consumer = new Thread(new Consumer(sharedQueue));

        producer.start();
        consumer.start();

    }

    static class Producer implements Runnable {

        private final BlockingQueue<Integer> sharedQueue;

        public Producer(BlockingQueue<Integer> sharedQueue) {
            this.sharedQueue = sharedQueue;
        }


        @Override
        public void run() {
            for (int i = 0; i < 10; ++i) {
                try {
                    System.out.println("Produce: " + i);
                    sharedQueue.put(i);
                    Thread.sleep(50l);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    static class Consumer implements Runnable {

        private final BlockingQueue<Integer> sharedQueue;

        public Consumer(BlockingQueue<Integer> sharedQueue) {
            this.sharedQueue = sharedQueue;
        }


        @Override
        public void run() {
            for (int i = 0; i < 10; ++i) {
                try {
                    Integer consumed = sharedQueue.take();
                    Thread.sleep(50l);
                    System.out.println("Consumed: " + consumed);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
