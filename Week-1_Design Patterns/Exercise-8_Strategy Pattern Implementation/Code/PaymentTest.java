public class PaymentTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment());
        context.pay(500);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment());
        context.pay(1200);
    }
}
