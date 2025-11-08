package Basic;
import java.util.Scanner;

class Multi_Array{
	int[][] a1=new int[2][2];
	int[][] a2=new int[2][2];
	int[][] sum=new int[2][2];
	int[][] sub=new int[2][2];
	Multi_Array(int[][] a,int[][] b)
	{
		a1=a;
		a2=b;
	}
	void addition()
	{
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				sum[i][j]=a1[i][j]+a2[i][j];
			}
		}
	}
	void subtraction()
	{
		for(int i=0;i<sub.length;i++)
		{
			for(int j=0;j<sub[i].length;j++)
			{
				sub[i][j]=a1[i][j]-a2[i][j];
			}
		}
	}
	void display()
	{
		System.out.println("First Array.....");
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1[i].length;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second Array.....");
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Additon.....");
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Subtraction.....");
		for(int i=0;i<sub.length;i++)
		{
			for(int j=0;j<sub[i].length;j++)
			{
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class Matrix2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a1=new int[2][2];
		int[][] a2=new int[2][2];
		System.out.println("Enter 4 Elements For First Array");
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1[i].length;j++)
			{
				System.out.println("Enter Ele["+i+"]["+j+"]=");
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 4 Elements For Second Array");
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				System.out.println("Enter Ele["+i+"]["+j+"]=");
				a2[i][j]=sc.nextInt();
			}
		}
		Multi_Array obj=new Multi_Array(a1,a2);
		obj.addition();
		obj.subtraction();
		obj.display();
	}

}
