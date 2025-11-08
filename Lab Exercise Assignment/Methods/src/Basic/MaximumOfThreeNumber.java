package Basic;

import java.util.Scanner;

class FindMax{
	int n1,n2,n3;
	FindMax(int n1,int n2,int n3)
	{
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	int Max()
	{
		int maximum;
		if(n1>n2)
		{
			if(n1>n3)
			{
				maximum=n1;
			}
			else
			{
				maximum=n3;
			}
		}
		else {
			if(n2>n3)
			{
				maximum=n2;
			}
			else
			{
				maximum=n3;
			}
		}
		return maximum;
	}
}
public class MaximumOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number");
		int n2=sc.nextInt();
		System.out.println("Enter Third Number");
		int n3=sc.nextInt();
		FindMax obj=new FindMax(n1,n2,n3);
		System.out.println("Maximum Number is "+obj.Max());
	}

}
