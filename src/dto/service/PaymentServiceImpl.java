package dto.service;

import dto.interfaces.PaymentService;
import dto.paymentMethods.Cash;
import dto.paymentMethods.CreditCard;
import dto.paymentMethods.PaymentMethod;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void acceptCash(int amount) {
        PaymentMethod cash = new Cash();
        cash.initiatePayment(amount);
    }

    @Override
    public void acceptCreditCard(String cardNumber, int cvv, int amount) {
        PaymentMethod creditCard = new CreditCard(cardNumber, cvv);
        creditCard.initiatePayment(amount);
    }
}
