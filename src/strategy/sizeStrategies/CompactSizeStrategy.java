package strategy.sizeStrategies;

public class CompactSizeStrategy implements SizeStrategy{
    @Override
    public void size() {
        System.out.println("Small Plane, Didn't get a seat");
    }
}
