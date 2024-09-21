package criacionais.factoryMethod.paymentOrder;

import criacionais.factoryMethod.payment.CreditCardPayment;
import criacionais.factoryMethod.payment.PaymentInterface;

//Criador concreto de pagamento
public class ApproximationOrder extends BaseCreatorOrder {
    @Override
    PaymentInterface payment() {
        return new CreditCardPayment();
    }
}
