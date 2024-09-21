package criacionais.factoryMethod.payment;

//Método Cartão de crédito
public class CreditCardPayment implements PaymentInterface {
    @Override
    public String paymentType() {
       return "Cartão de Crédito.";
    }
}
