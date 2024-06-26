package Singleton.ClassicSingleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ClassicSingletonMultipleThreadsTest {
    @Test
    public void testMultipleThreads() throws InterruptedException {
        int numThreads = 10000;
        Thread[] threads = new Thread[numThreads];
        ClassicSingleton[] instances = new ClassicSingleton[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                instances[index] = ClassicSingleton.getInstance();
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

