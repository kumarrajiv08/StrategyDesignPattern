import strategy.fly.FlyStrategy;
import strategy.size.SizeStrategy;

public class Plane {

    FlyStrategy flyStrategy;
    SizeStrategy sizeStrategy;

    Plane(FlyStrategy flyStrategy,SizeStrategy sizeStrategy) {
        this.flyStrategy = flyStrategy;
        this.sizeStrategy = sizeStrategy;
    }

    public void fly(){
        flyStrategy.fly();
    }
    public void size(){
        sizeStrategy.size();
    }

}
