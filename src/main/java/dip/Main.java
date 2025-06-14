package dip;
public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod crypto = new CryptoPayment();

        PaymentProcessor processor1 = new PaymentProcessor(creditCard);
        PaymentProcessor processor2 = new PaymentProcessor(paypal);
        PaymentProcessor processor3 = new PaymentProcessor(crypto);

        processor1.makePayment(150.0);
        processor2.makePayment(200.0);
        processor3.makePayment(300.0);
    }
}
