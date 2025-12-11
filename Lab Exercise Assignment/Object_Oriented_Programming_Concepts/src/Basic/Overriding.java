package Basic;
class Vehicle{
	void start()
	{
		System.out.println("Vehicle is starting...");
	}
}
class Car extends Vehicle{
	void start()
	{
		System.out.println("Car is starting with a key");
	}
}
class SportsCar extends Car{
	void start()
	{
		System.out.println("Sports Car is starting with a push button..");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		Car c=new Car();
		SportsCar sc=new SportsCar();
		v.start();
		c.start();
		sc.start();
	}
}
