package Week1_Exercises.Design_Pattern_And_Principles.Exercise1_Singleton_Pattern;

public class Main {
    public static void main(String[] args){
        MySingleton instance1 = MySingleton.getInstance();
        MySingleton instance2 = MySingleton.getInstance();

        instance1.doSomething();

        System.out.println("same instance?"+ (instance1==instance2));
    }
}
