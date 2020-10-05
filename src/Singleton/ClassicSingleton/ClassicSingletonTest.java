package Singleton.ClassicSingleton;

public class ClassicSingletonTest {
    public static void main(String[] args){
        ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
        ClassicSingleton classicSingletonNextInstance = ClassicSingleton.getInstance();

        if (classicSingleton.equals(classicSingletonNextInstance)){
            System.out.println("The same instance");
        }
    }
}
