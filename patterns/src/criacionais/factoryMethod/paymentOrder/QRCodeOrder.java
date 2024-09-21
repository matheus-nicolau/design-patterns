package criacionais.factoryMethod.paymentOrder;

import criacionais.factoryMethod.payment.PaymentInterface;
import criacionais.factoryMethod.payment.PixPayment;

//Criador concreto de pagamento
public class QRCodeOrder extends BaseCreatorOrder {
    @Override
    PaymentInterface payment() {
        return new PixPayment();
    }
}
