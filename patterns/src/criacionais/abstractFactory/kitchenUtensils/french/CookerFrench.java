package criacionais.abstractFactory.kitchenUtensils.french;

import criacionais.abstractFactory.kitchenUtensils.Cooker;

public class CookerFrench implements Cooker {
    @Override
    public String getCookerType() {
        return "Cooker French.";
    }
}
