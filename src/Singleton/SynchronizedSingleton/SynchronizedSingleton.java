package Singleton.SynchronizedSingleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton singletonInstance;

    private SynchronizedSingleton(){}

    public static synchronized SynchronizedSingleton getInstance(){
        if (singletonInstance == null) {
            singletonInstance = new SynchronizedSingleton();
        }
        return singletonInstance;
    }
}
