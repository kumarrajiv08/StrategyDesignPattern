import strategy.FlyStrategy;

public class Plane {

    FlyStrategy flyStrategy;

    Plane(FlyStrategy strategy) {
        this.flyStrategy = strategy;
    }

    public void fly(){
        flyStrategy.fly();
    }

}
