package Basic;

class Find_Area{
	double radius,length,breadth;
	Find_Area() // default Constructor
	{
		System.out.println("Default Constructor Calling....");
	}
	Find_Area(double r) // parameterized Constructor
	{
		radius=r;
		
	}
	Find_Area(double l,double b) // parameterized Constructor
	{
		length=l;
		breadth=b;
	}
	void displayAreaOfCircle() {
		System.out.println("Area of Circle="+(3.14*radius*radius));
	}
	void displayAreaOfRectangle() {
		System.out.println("Area of Rectangle="+(length*breadth));
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Find_Area obj1=new Find_Area();
		Find_Area obj2=new Find_Area(10);
		Find_Area obj3=new Find_Area(10,3);
		obj2.displayAreaOfCircle();
		obj3.displayAreaOfRectangle();
		
	}

}
