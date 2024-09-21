package criacionais.factoryMethod.payment;

//Método Pix
public class PixPayment implements PaymentInterface {
    @Override
    public String paymentType() {
        return "Pix";
    }
}
