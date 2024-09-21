package criacionais.factoryMethod.paymentOrder;

import criacionais.factoryMethod.payment.PaymentInterface;

// Criador Base de Pagamento
public abstract class BaseCreatorOrder {

    public String getPayment() {
        PaymentInterface payment = payment();
        return payment.paymentType();
    }

    abstract PaymentInterface payment();
}
