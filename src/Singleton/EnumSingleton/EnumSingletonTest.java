package Singleton.EnumSingleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;

public class EnumSingletonTest {
    @Test
    public void testMultipleInstances() {
        EnumSingleton[] instances = new EnumSingleton[100000];

        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            instances[i] = EnumSingleton.SINGLETON;
        }
        long endTime = System.nanoTime();
        checkRuntime(startTime, endTime);

        for (int i = 1; i < 100000; i++) {
            assertSame(instances[0], instances[i], "Singleton instances should be the same.");
        }
    }

    private void checkRuntime(long startTime, long endTime) {
        long durationInNanos = endTime - startTime;
        long durationInMillis = durationInNanos / 1_000_000;

        System.out.println("Time: " + durationInMillis + " ms");
        System.out.println("Time: " + durationInNanos + " ns");
    }
}
