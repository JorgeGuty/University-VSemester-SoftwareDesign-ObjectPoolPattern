package CarPool;

import Pattern.Reusable;
import Pattern.ReusablePool;

public class CarPool extends ReusablePool {

    public CarPool(Integer pMaxSize) {
        super(pMaxSize);
    }

    @Override
    protected Reusable createReusable() {
        return new Car();
    }

}
