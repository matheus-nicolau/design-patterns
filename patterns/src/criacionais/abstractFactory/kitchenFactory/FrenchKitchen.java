package criacionais.abstractFactory.kitchenFactory;

import criacionais.abstractFactory.kitchenUtensils.Cooker;
import criacionais.abstractFactory.kitchenUtensils.FryingPan;
import criacionais.abstractFactory.kitchenUtensils.Spatula;
import criacionais.abstractFactory.kitchenUtensils.french.CookerFrench;
import criacionais.abstractFactory.kitchenUtensils.french.FryingPanFrench;
import criacionais.abstractFactory.kitchenUtensils.french.SpatulaFrench;

public class FrenchKitchen implements KitchenAbstract{
    @Override
    public String getKitchen() {
        return "Francesa";
    }

    @Override
    public Cooker getCooker() {
        return new CookerFrench();
    }

    @Override
    public FryingPan getFryingPan() {
        return new FryingPanFrench();
    }

    @Override
    public Spatula getSpatula() {
        return new SpatulaFrench();
    }
}
