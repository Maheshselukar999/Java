package Basic;

public class StringMehod {

	public static void main(String[] args) {
		String str="Hello";
		String s="Hello";
		String str1=new String("Hello");
		System.out.println(str==s); // str and s store in scp with same reference not value		
		System.out.println(str==str1); // == check reference not value
		String str2=new String("Hello");
		System.out.println(str1==str2); // str1 and str2 store with different references..	
		System.out.println(str1.equals(str2)); // equals method check value only not reference
		// compareTo method check value and return integer value o and 1 
		System.out.println(str1.compareTo(str2)); // return 0 means both value same
	}
}
