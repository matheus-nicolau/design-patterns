package criacionais.abstractFactory.kitchenFactory;

import criacionais.abstractFactory.kitchenUtensils.Cooker;
import criacionais.abstractFactory.kitchenUtensils.FryingPan;
import criacionais.abstractFactory.kitchenUtensils.Spatula;
import criacionais.abstractFactory.kitchenUtensils.cowntry.CookerCowntry;
import criacionais.abstractFactory.kitchenUtensils.cowntry.FryingPanCowntry;
import criacionais.abstractFactory.kitchenUtensils.cowntry.SpatulaConwtry;

public class CowntryKitchen implements KitchenAbstract{
    @Override
    public String getKitchen() {
        return "Cowntry";
    }

    @Override
    public Cooker getCooker() {
        return new CookerCowntry();
    }

    @Override
    public FryingPan getFryingPan() {
        return new FryingPanCowntry();
    }

    @Override
    public Spatula getSpatula() {
        return new SpatulaConwtry();
    }
}
