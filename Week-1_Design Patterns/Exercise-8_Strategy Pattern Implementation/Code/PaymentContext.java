
public class PaymentContext {
	private PaymentStrategy ps;  
	
	public void setPaymentStrategy(PaymentStrategy strategy) {
        this.ps = strategy;
    }
	
	public void pay(int amount) {
        if (ps == null) {
            System.out.println("Payment strategy not set.");
        } else {
            ps.pay(amount);
        }
    }
}
