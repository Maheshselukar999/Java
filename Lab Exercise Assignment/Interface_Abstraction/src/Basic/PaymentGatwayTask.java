package Basic;
interface PaymentGateway{
	void payment(double amount);
}
class CreditCard implements PaymentGateway{
	public void payment(double amount)
	{
		System.out.println("Processing Credit Card Payment of rs."+amount);
	}
}
class UPIPayment implements PaymentGateway{
	public void payment(double amount)
	{
		System.out.println("Processing UPI Payment of rs."+amount);
	}
}
public class PaymentGatwayTask {

	public static void main(String[] args) {
		CreditCard m1=new CreditCard();
		UPIPayment m2=new UPIPayment();
		m1.payment(3000);
		m2.payment(5000);
	}

}
