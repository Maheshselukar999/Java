package Basic;

class Demo{
	Demo()
	{
		System.out.println("Default Constructor called");
	}
	Demo(String m)
	{
		System.out.println("Constructor Overloading with single parameter..."+m);
	}
	Demo(String name, int roll)
	{
		System.out.println("Constructor Overloading with two parameter");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {	
		Demo d1=new Demo();// Default constructor calling...
		Demo d2=new Demo("Hello"); // parameterized Constructor calling with single argument (Constructor overloading)
		Demo d3=new Demo("Mahesh",2);// parameterized Constructor calling with two argument (Constructor overloading)
		
	}

}
