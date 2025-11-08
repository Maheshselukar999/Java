package Basic;
interface Printable{
	void print();
}
interface Showable{
	void show();
}
class Demo implements Printable,Showable{
	public void print() {
		System.out.println("print method from printable interface");
	}
	public void show()
	{
		System.out.println("Show method from showable interface");
	}
}
public class MultipleINterfaceDemo {

	public static void main(String[] args) {
	Demo d=new Demo();
	d.print();
	d.show();
	}

}
