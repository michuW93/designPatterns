package Singleton.ClassicSingleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassicSingletonTest {
    @Test
    public void testMultipleInstances() {
        ClassicSingleton[] instances = new ClassicSingleton[100000];

        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            instances[i] = ClassicSingleton.getInstance();
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
