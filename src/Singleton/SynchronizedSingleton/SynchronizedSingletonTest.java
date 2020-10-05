package Singleton.SynchronizedSingleton;

public class SynchronizedSingletonTest {
    public static void main(String[] args){
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingletonNextInstance = SynchronizedSingleton.getInstance();
        if(synchronizedSingleton.equals(synchronizedSingletonNextInstance)){
            System.out.println("The same instance");
        }
    }
}
