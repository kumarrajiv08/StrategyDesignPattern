import strategy.fly.FastFlyStrategy;
import strategy.size.CompactSizeStrategy;

public class JetPlane extends Plane{
    JetPlane() {
        super(new FastFlyStrategy(),new CompactSizeStrategy());
    }
}
