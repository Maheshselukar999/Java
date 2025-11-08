package Basic;

class Student{
	int age=25;
	String name="Mahesh";
	void display()
	{
		System.out.println("Age:="+age+"\nName:="+name);
	}
	
}
public class Task1 {

	public static void main(String[] args) {
		Student s=new Student();
		s.display();

	}

}
