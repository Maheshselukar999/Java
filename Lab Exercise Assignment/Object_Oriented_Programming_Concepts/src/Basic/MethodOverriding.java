package Basic;

class RBI_Bank {
	void rateOfInterest()
	{
		System.out.println("RBI Bank....");
	}
}
class SBI_Bank extends RBI_Bank{
	@Override
	void rateOfInterest()
	{
		System.out.println("SBI Bank Rate of Interest is 6.5%");
	}
}
class ICICI extends RBI_Bank{
	@Override
	void rateOfInterest()
	{
		System.out.println("ICICI Bank Rate of Interest is 8.5%");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
	SBI_Bank s=new SBI_Bank();
	ICICI i=new ICICI();
	s.rateOfInterest();
	i.rateOfInterest();
	}

}
