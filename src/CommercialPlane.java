import strategy.NormalFlyStrategy;

public class CommercialPlane extends Plane{
    CommercialPlane() {
        super(new NormalFlyStrategy());
    }

    @Override
    public void fly() {
        super.fly();
    }
}
