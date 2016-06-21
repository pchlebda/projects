package reentrant;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Piotr on 21.06.2016.
 */
public class ReentrantLockSample {

    private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;

    public int getCount(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" count: "+count);
            return count++;
        }finally {
            lock.unlock();
        }
    }

    class Task implements Runnable{


        @Override
        public void run() {
            while (getCount()<10){
                try {
                    Thread.sleep(100l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        ReentrantLockSample reentrantLockSample = new ReentrantLockSample();
        Runnable firstTask = reentrantLockSample.new Task();
        Runnable secondTask = reentrantLockSample.new Task();

        new Thread(firstTask,"Bill").start();
        new Thread(secondTask,"Joe").start();
    }


}
