package lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Piotr on 2015-04-12.
 */
class BoundedBuffer {
    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();

    final Object[] items = new Object[1];
    int putptr, takeptr, count;

    public void put(Object x) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length) {
                System.out.println(Thread.currentThread().getName()+" is await on put");
                notFull.await();
                System.out.println(Thread.currentThread().getName()+" has crossed await on put");
            }
            System.out.println(Thread.currentThread().getName() + " put " + x);
            items[putptr] = x;
            if (++putptr == items.length) putptr = 0;
            ++count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                System.out.println(Thread.currentThread().getName()+" is await on take");
                notEmpty.await();
                System.out.println(Thread.currentThread().getName()+" has crossed await on take");
                Thread.sleep(10000l);
            }
            Object x = items[takeptr];
            System.out.println(Thread.currentThread().getName() + " took " + x);
            if (++takeptr == items.length) takeptr = 0;
            --count;
            notFull.signal();
            return x;
        } finally {
            lock.unlock();
        }
    }
}