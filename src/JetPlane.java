import strategy.FastFlyStrategy;

public class JetPlane extends Plane{
    JetPlane() {
        super(new FastFlyStrategy());
    }

    @Override
    public void fly() {
        super.fly();
    }
}
