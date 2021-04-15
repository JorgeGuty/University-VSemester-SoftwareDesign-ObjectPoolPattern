package Pattern;

import CarPool.CarPool;

public class Singleton{

    private static Singleton instance;

    public CarPool carPool;

    private Singleton(){
        carPool = new CarPool(5);
    }

    public static synchronized Singleton getInstance(){
        if (Singleton.instance == null) Singleton.instance = new Singleton();
        return Singleton.instance;
    }

}
