package Basic;
class Parent{
	int property=300000;
}
class Child extends Parent{
	int cproperty=100000;
	void show() {
		System.out.println("Parent Property="+property);
		System.out.println("Child Property="+cproperty);
		System.out.println("Total Property (child+Parent)="+(property+cproperty));
	}
}
public class DemoExtends {
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.show();
	}
}
