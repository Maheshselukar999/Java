package Basic;

class RBI{
	void message()
	{
		System.out.println("RBI Bank");
	}
}
class SBI extends RBI{
	void rateOfInterest()
	{
		System.out.println("SBI Bank Provide Rate Of Interest 6.5%");
	}
}


class Animal{
	void eat()
	{
		System.out.println("Animal Eat Foods");
	}
} 
class Dog extends Animal{
	void sound()
	{
		System.out.println("Dog Bark...");	
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println("First Demo of Single inheritance...");
		obj.message();
		obj.rateOfInterest();

		System.out.println("Seconds Demo of Single inheritance...");
		Dog d=new Dog();
		d.eat();
		d.sound();
	}
}
