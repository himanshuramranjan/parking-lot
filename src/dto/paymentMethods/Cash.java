package dto.paymentMethods;

public class Cash extends PaymentMethod {

    @Override
    public boolean initiatePayment(int amount) {
        System.out.println("Paying the amount for cash " + amount);
        return true;
    }
}
