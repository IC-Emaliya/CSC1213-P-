import java.util.Scanner;
class D3EX2
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Input first no:");
		int n1=ob.nextInt();
		
		System.out.println("Input second no:");
		int n2=ob.nextInt();
		
		
		System.out.println("Input Third no:");
		int n3=ob.nextInt();
		
		if((n1>n2)&&(n1>n3))
		{
			System.out.println("First number is the greatest number");
		}
		else if((n2>n3)&&(n2>n1))
		{
			System.out.println("Second number is the greatest number");
		}
		else
		{
			System.out.println("Third number is the greatest number");
		}
		
	}
}
