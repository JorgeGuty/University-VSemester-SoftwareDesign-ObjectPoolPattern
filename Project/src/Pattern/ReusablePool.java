package Pattern;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public abstract class ReusablePool{

    private Stack<Reusable> pool;
    private Integer maxSize;

    public ReusablePool(Integer pMaxSize) {
        this.pool = new Stack<>();
        this.maxSize = pMaxSize;
        for (int count = 0; count < maxSize; count++){
            this.pool.push(createReusable());
        }
    }

    public Reusable acquireReusable(){
        if (!pool.isEmpty()) {
            return pool.pop();
        }
        return createReusable();
    }

    public void releaseReusable(Reusable pReturnedReusable){
        if (this.pool.size() < maxSize) {
            this.pool.push(pReturnedReusable);
        }
    }

    // Method set to implement the way each ReusablePool create its pool object.
    protected abstract Reusable createReusable();

    public void setMaxSize(Integer pMaxSize){
        this.maxSize = pMaxSize;
    }

}
