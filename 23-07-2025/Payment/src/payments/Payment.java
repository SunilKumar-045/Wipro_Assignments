package payments;

public class Payment {

	public static void main(String[] args) {
		
		CreditCardPayment credit = new CreditCardPayment();
		PayPalPayment paypal = new PayPalPayment();
		
		credit.makePayment(50000);
		paypal.makePayment(80000);

	}

}
