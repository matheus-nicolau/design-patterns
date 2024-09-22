package criacionais.abstractFactory;

import criacionais.abstractFactory.kitchenFactory.KitchenAbstract;
import criacionais.abstractFactory.kitchenUtensils.Cooker;
import criacionais.abstractFactory.kitchenUtensils.FryingPan;
import criacionais.abstractFactory.kitchenUtensils.Spatula;

public class AbstractFactoryClient {

    private String kitchenType;
    private Cooker cooker;
    private FryingPan fryingPan;
    private Spatula spatula;

    AbstractFactoryClient(KitchenAbstract kitchen){
        kitchenType = kitchen.getKitchen();
        cooker = kitchen.getCooker();
        fryingPan = kitchen.getFryingPan();
        spatula = kitchen.getSpatula();
    }

    public String getKitchenType() {
        return kitchenType;
    }

    public Cooker getCooker() {
        return cooker;
    }

    public FryingPan getFryingPan() {
        return fryingPan;
    }

    public Spatula getSpatula() {
        return spatula;
    }

}
