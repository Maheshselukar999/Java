package Basic;

class Grand_Parent{
	int property_Of_GrandParent=150000;
	void displayGrandParentProperty()
	{
		System.out.println("Total Property of Grand Parent="+property_Of_GrandParent);
	}
}
class Parent extends Grand_Parent{
	int property_Of_Parent=100000;
	int total_Property_Of_Parent=property_Of_GrandParent+property_Of_Parent;
	void displayParentProperty()
	{
		System.out.println("Property of Parent="+property_Of_Parent);
		System.out.println("Total Property of Parent="+total_Property_Of_Parent);		
	}
}
class Child extends Parent{
	int property_Of_Child=50000;
	int total_Property_Of_Child=property_Of_Child+total_Property_Of_Parent;
	void displayChildProperty()
	{
		System.out.println("Property of Child="+property_Of_Child);
		System.out.println("Total Property of Child="+total_Property_Of_Child);		
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
			Child obj=new Child();
			obj.displayGrandParentProperty();
			obj.displayParentProperty();
			obj.displayChildProperty();
	}

}
