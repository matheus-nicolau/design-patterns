package criacionais.abstractFactory.kitchenFactory;

import criacionais.abstractFactory.kitchenUtensils.Cooker;
import criacionais.abstractFactory.kitchenUtensils.FryingPan;
import criacionais.abstractFactory.kitchenUtensils.Spatula;

public interface KitchenAbstract {
    String getKitchen();
    Cooker getCooker();
    FryingPan getFryingPan();
    Spatula getSpatula();
}
