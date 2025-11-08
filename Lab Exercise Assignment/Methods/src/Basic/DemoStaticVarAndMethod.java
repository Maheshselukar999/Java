package Basic;

class Demo_Of_Static{
	static String collegeName="P.D.Pandya"; // static variable
	String studentName; // non-static variable
	Demo_Of_Static(String sname)
	{
		studentName=sname;
	}
	// non-static method
	void display()
	{
		System.out.println("College Name="+collegeName);
		System.out.println("Student Name="+studentName);
	}
	// static method
	static void changeCollegeName(String cname)
	{
		collegeName=cname;
	}
}
public class DemoStaticVarAndMethod {

	public static void main(String[] args) {
		System.out.println("Static variable Access using Class name...College Name="+Demo_Of_Static.collegeName);
		Demo_Of_Static s1=new Demo_Of_Static("Mahesh");
		Demo_Of_Static s2=new Demo_Of_Static("Parth");
		// display before changing
		s1.display();
		s2.display();
		
		// changing college name using static method
		Demo_Of_Static.changeCollegeName("L.J college");
		// After Changing college Name
		System.out.println("After Change College Name....");
		s1.display();
		s2.display();
		
		
	}

}
