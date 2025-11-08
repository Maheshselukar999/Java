package Basic;

import java.util.Scanner;

class Find_Area{
	void area(double r)
	{
		System.out.println("Area of Circle is "+(3.14*r*r));
	}
	void area(double l,double b)
	{
		System.out.println("Area of Rectangle is "+(l*b));
	}
	void area(int side)
	{
		System.out.println("Area of Square is "+(side*side));
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle=");
		double r=sc.nextDouble();
		System.out.println("Enter length of Rectangle=");
		double l=sc.nextDouble();
		System.out.println("Enter breadth of Rectangle=");
		double b=sc.nextDouble();
		System.out.println("Enter side of Square=");
		int s=sc.nextInt();
		Find_Area obj=new Find_Area();
		obj.area(r);
		obj.area(l, b);
		obj.area(s);	
	}
}
