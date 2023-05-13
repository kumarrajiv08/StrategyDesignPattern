import strategy.flyStrategies.FastFlyStrategy;
import strategy.sizeStrategies.CompactSizeStrategy;

public class JetPlane extends Plane{
    JetPlane() {
        super(new FastFlyStrategy(),new CompactSizeStrategy());
    }
}
