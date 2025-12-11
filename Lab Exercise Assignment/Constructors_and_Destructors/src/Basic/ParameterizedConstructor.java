package Basic;
class Student{
	String name;
	int roll;
	Student(String n,int r)
	{
		name=n;
		roll=r;
	}
	void display()
	{
		System.out.println("Student Name="+name);
		System.out.println("Student Roll="+roll);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
	Student s=new Student("Mahesh",1);
	s.display();
	}

}
