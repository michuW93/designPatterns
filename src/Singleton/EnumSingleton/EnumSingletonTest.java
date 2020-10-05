package Singleton.EnumSingleton;

public class EnumSingletonTest {
    public static void main(String[] args){
        EnumSingleton singleton = EnumSingleton.SINGLETON;
        EnumSingleton singletonNextInstance = EnumSingleton.SINGLETON;
        if(singleton.equals(singletonNextInstance)){
            System.out.println("The same instance");
        }
    }
}
