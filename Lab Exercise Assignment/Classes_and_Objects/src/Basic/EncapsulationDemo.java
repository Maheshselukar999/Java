package Basic;
class Emp{
	String name;
	int id,age;
	void setName(String n)
	{
		name=n;
	}
	void setId(int id)
	{
		this.id=id;
	}
	void setAge(int a)
	{
		age=a;
	}
	String getName()
	{
		return name;
	}
	int getId()
	{
		return id;
	}
	int getAge()
	{
		return age;
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.setName("Parth");
		e.setId(101);
		e.setAge(25);
		System.out.println("Employee Name= "+e.getName());
		System.out.println("Employee Id= "+e.getId());
		System.out.println("Employee Age= "+e.getAge());
		
	}

}
