package Week1_Exercises.Design_Pattern_And_Principles.Exercise1_Singleton_Pattern;

public class MySingleton {

        private MySingleton(){
            System.out.println("instance created");
        }
        private static final class singletonHelper{
            private static final MySingleton instance = new MySingleton();
        }
        public static MySingleton getInstance(){
            return singletonHelper.instance;
        }
        public void doSomething(){
            System.out.println("doing");
        }


    }

