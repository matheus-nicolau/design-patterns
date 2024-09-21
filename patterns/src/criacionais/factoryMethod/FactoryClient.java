package criacionais.factoryMethod;


import criacionais.factoryMethod.paymentOrder.ApproximationOrder;
import criacionais.factoryMethod.paymentOrder.BaseCreatorOrder;
import criacionais.factoryMethod.paymentOrder.QRCodeOrder;

import java.util.Random;

public class FactoryClient {

    public static void main(String[] args) {

        BaseCreatorOrder order;

        Random random = new Random();

        // Simulação condicional:
        // Quando for 0 o pagamento será via Cartão de Crédito
        // Quando for 1 o pagamento será via Pix
        if (random.nextInt(2) == 0) {
            order = new ApproximationOrder();
            System.out.println("Este é um pagamento via: " + order.getPayment());

        } else {
            order = new QRCodeOrder();
            System.out.println("Este é um pagamento via: " + order.getPayment());

        }


    }

}


