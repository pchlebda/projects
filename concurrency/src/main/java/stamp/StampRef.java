package stamp;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * Created by Piotr on 12.07.2016.
 */
public class StampRef {

    public static void main(String[] args) {
        String initialRef = "initial value referenced";
        int initialStamp = 0;

        AtomicStampedReference<String> atomicStampedReference = new AtomicStampedReference<>(initialRef, initialStamp);

        String newRef = "new value referenced";
        int newStamp = initialStamp + 1;

        boolean exchanged = atomicStampedReference.compareAndSet(initialRef, newRef, initialStamp, newStamp);
        System.out.println("exchanged: "+exchanged);

        exchanged = atomicStampedReference.compareAndSet(initialRef, "new string", newStamp, newStamp+1);
        System.out.println("exchanged: "+exchanged);

        exchanged = atomicStampedReference.compareAndSet(newRef, "new string", initialStamp, newStamp+1);
        System.out.println("exchanged: "+exchanged);

        exchanged = atomicStampedReference.compareAndSet(newRef, "new string", newStamp, newStamp+1);
        System.out.println("exchanged: "+exchanged);
    }
}
