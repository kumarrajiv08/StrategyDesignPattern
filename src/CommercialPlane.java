import strategy.flyStrategies.NormalFlyStrategy;
import strategy.sizeStrategies.LargeSizeStrategy;

public class CommercialPlane extends Plane{
    CommercialPlane() {
        super(new NormalFlyStrategy(),new LargeSizeStrategy());
    }
}
