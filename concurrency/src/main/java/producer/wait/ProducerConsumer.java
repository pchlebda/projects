package producer.wait;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 5;

        Thread producer = new Thread(new Producer(queue, maxSize));
        Thread consumer = new Thread(new Consumer(queue));


        producer.start();
        consumer.start();

    }

    static class Producer implements Runnable {

        private Queue<Integer> queue;
        int maxSize;

        public Producer(Queue<Integer> queue, int maxSize) {
            this.queue = queue;
            this.maxSize = maxSize;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == maxSize) {
                        System.out.println("Queue is full!");

                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    Random random = new Random();
                    int number = random.nextInt(1000);
                    System.out.println("Producing: " + number);
                    queue.add(number);
                    queue.notifyAll();
                }
            }
        }
    }


    static class Consumer implements Runnable {

        private Queue<Integer> queue;

        public Consumer(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("Consuming: " + queue.remove());
                    queue.notifyAll();

                }
            }
        }
    }

}
