package Singleton.SynchronizedSingleton;

import Singleton.ClassicSingleton.ClassicSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SynchronizedSingletonMultipleThreadsTest {
    @Test
    public void testMultipleThreads() throws InterruptedException {
        int numThreads = 10000;
        Thread[] threads = new Thread[numThreads];
        SynchronizedSingleton[] instances = new SynchronizedSingleton[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                instances[index] = SynchronizedSingleton.getInstance();
            });
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }

        for (int i = 1; i < numThreads; i++) {
            assertSame(instances[0], instances[i], "Singleton instances should be the same.");
        }
    }
}
