package Pattern;

import CarPool.CarPool;
import CarPool.Car;

public class main {
    public static void main(String[] args) {

        CarPool example = Singleton.getInstance().carPool;

        Car car1 = (Car) example.acquireReusable();
        Car car2 = (Car) example.acquireReusable();
        Car car3 = (Car) example.acquireReusable();
        Car car4 = (Car) example.acquireReusable();
        Car car5 = (Car) example.acquireReusable();
        Car car6 = (Car) example.acquireReusable();
        Car car7 = (Car) example.acquireReusable();
        Car car8 = (Car) example.acquireReusable();

        example.releaseReusable(car1);
        example.releaseReusable(car2);
        example.releaseReusable(car3);
        example.releaseReusable(car4);
        example.releaseReusable(car5);
        example.releaseReusable(car6);
        example.releaseReusable(car7);
        example.releaseReusable(car8);
    }
}
