package strategy.sizeStrategies;

public class LargeSizeStrategy implements SizeStrategy{
    @Override
    public void size() {
        System.out.println("Cozy, enough space to roam around");
    }
}
