package strategy.fly;

public class FastFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("Flying fast, using FastFlyStrategy");
    }
}
