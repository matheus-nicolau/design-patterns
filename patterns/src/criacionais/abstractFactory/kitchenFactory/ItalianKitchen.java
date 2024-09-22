package criacionais.abstractFactory.kitchenFactory;

import criacionais.abstractFactory.kitchenUtensils.Cooker;
import criacionais.abstractFactory.kitchenUtensils.FryingPan;
import criacionais.abstractFactory.kitchenUtensils.Spatula;
import criacionais.abstractFactory.kitchenUtensils.italian.CookerItalian;
import criacionais.abstractFactory.kitchenUtensils.italian.FryingPanItalian;
import criacionais.abstractFactory.kitchenUtensils.italian.SpatulaItalian;

public class ItalianKitchen implements KitchenAbstract{
    @Override
    public String getKitchen() {
        return "Italian";
    }

    @Override
    public Cooker getCooker() {
        return new CookerItalian();
    }

    @Override
    public FryingPan getFryingPan() {
        return new FryingPanItalian();
    }

    @Override
    public Spatula getSpatula() {
        return new SpatulaItalian();
    }
}
