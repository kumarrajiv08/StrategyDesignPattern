package strategy.fly;

public class NormalFlyStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Flying Normally, using NormalFlyStrategy");
    }
}
