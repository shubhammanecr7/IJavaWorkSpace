package designPattern;

/**
 * In this singleton design pattern we will create a class in such a way that
 * when its instance or object is requested only one single instance will be
 * created and then same instance will be shared whenever an instance os this
 * class is required, As it will only construct single instance it is known as
 * singleton design pattern
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    /*This is a lazy way of creating the object that means object is only
     * created when asked, Here the object creation is also synchronised
     * so that multithreading will not affect at the time of object construction*/
    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
