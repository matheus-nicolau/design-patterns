package criacionais.abstractFactory;

import criacionais.abstractFactory.kitchenFactory.CowntryKitchen;
import criacionais.abstractFactory.kitchenFactory.FrenchKitchen;
import criacionais.abstractFactory.kitchenFactory.ItalianKitchen;
import criacionais.abstractFactory.kitchenFactory.KitchenAbstract;

import java.util.Random;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        KitchenAbstract factory = null;

        Random random = new Random();
        int validator =  random.nextInt(3);

        // Simulação condicional:
        // Quando for 0 a Cozinha será Cowntry
        // Quando for 1 a Cozinha será Francesa
        // Quando for 2 a Cozinha será Italiana

        if (validator == 0) {
            factory = new CowntryKitchen();
        }

        if(validator == 1) {
            factory = new FrenchKitchen();
        }

        if(validator == 2) {
            factory = new ItalianKitchen();
        }

        var client = new AbstractFactoryClient(factory);

        System.out.println(
                "O tipo de Cozinha é: " + client.getKitchenType() + "\n" +
                "O Fogão é do tipo: " + client.getCooker().getCookerType() + "\n" +
                "A Frigideira é do tipo: " + client.getFryingPan().getFryingPanType() + "\n" +
                "A Espátula é do tipo: " + client.getSpatula().getSpatulaType());

    }
}
