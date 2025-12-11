package Basic;

import java.util.Scanner;

class Reverse_Palindrom{
	String str,rev="";
	Reverse_Palindrom(String s)
	{
		str=s;
	}
	void reverse()
	{ 
		char[] arr=str.toCharArray();
		int i=arr.length-1;
		
		while(i>=0)
		{
			rev=rev+arr[i];
			i--;
		}
		System.out.println("Reversed String="+rev);
		boolean isPalindrome=true;
		int j=0;
		char[] revarr=rev.toCharArray();
		while(j<arr.length)
		{
			if(arr[j]!=revarr[j])
			{
				isPalindrome=false;
				break;
			}
			j++;
		}
		if(isPalindrome)
		{
			System.out.println("Is is Palindrome");
		}
		else {

			System.out.println("Is is not a Palindrome");
		}
	}
}
public class ReverseAndPalindromes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		Reverse_Palindrom obj=new Reverse_Palindrom(str);
		obj.reverse();
	}
}
