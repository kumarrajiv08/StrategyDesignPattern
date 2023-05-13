import strategy.fly.NormalFlyStrategy;
import strategy.size.LargeSizeStrategy;

public class CommercialPlane extends Plane{
    CommercialPlane() {
        super(new NormalFlyStrategy(),new LargeSizeStrategy());
    }
}
