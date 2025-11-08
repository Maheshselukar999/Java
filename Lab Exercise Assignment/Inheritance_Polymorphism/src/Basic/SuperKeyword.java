package Basic;
class Person{
	String name;
	int age;
	Person(String n,int a)
	{
		this.name=n;
		this.age=a;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Employee extends Person{
	int salary;
	String role;
	Employee(String n,int a,int s,String r)
	{
		super(n,a);
		salary=s;
		role=r;
	}
	void display()
	{
		super.display();
		System.out.println("Salary="+salary);
		System.out.println("Role="+role);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Employee e=new Employee("Mahesh",25,50000,"Full stack developer");
		e.display();
	}

}
