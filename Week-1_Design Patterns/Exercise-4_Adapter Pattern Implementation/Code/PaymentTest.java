public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        PaymentProcessor razorpayProcessor = new RazorpayAdapter(new Razorpay());

        paypalProcessor.processPayment(250.0);
        stripeProcessor.processPayment(500.0);
        razorpayProcessor.processPayment(1000.0);
    }
}
