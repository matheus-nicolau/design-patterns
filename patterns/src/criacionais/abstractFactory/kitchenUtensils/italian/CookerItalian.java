package criacionais.abstractFactory.kitchenUtensils.italian;

import criacionais.abstractFactory.kitchenUtensils.Cooker;

public class CookerItalian implements Cooker {
    @Override
    public String getCookerType() {
        return "Cooker Italian.";
    }
}
