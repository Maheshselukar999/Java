package Basic;
interface Operations{
	void add(int a,int b);
	void sub(int a,int b);
}
class Calc implements Operations{
	public void add(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("Subtraction="+(a-b));
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Calc c=new Calc();
		c.add(10, 5);
		c.sub(10, 5);
	}

}
