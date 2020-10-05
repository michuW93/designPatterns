package Singleton.ClassicSingleton;

public class ClassicSingleton {
    private static ClassicSingleton singletonInstance;

    private ClassicSingleton(){}

    public static ClassicSingleton getInstance(){
        if (singletonInstance == null){
            singletonInstance = new ClassicSingleton();
        }
        return singletonInstance;
    }
}