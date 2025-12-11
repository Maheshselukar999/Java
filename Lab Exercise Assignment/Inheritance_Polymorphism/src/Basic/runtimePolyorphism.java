package Basic;
class RBI{
	void rateOfInterest()
	{
		System.out.println("RBI Bank");
	}
}
class SBI extends RBI{
	void rateOfInterest()
	{
		System.out.println("SBI Bank Rate of Interest = 6.7%");
	}
}
public class runtimePolyorphism {

	public static void main(String[] args) {
		SBI obj=new SBI();
		obj.rateOfInterest();
	}

}
