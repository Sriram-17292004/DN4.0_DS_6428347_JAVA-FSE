
public class CreditCardPayment implements PaymentStrategy {
	
	@Override
	public void pay(int amount) {
		System.out.println("Paid "+ amount +" Using Credit Card");
	}

}
