import java.util.Scanner;
class D2Hw1
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int n1=ob.nextInt();
		System.out.println("num1="+n1);
		
		System.out.println("Enter num2:");
		int n2=ob.nextInt();
		System.out.println("num2="+n2);
		
		if (n1>n2)
		{
			System.out.println("num1 is the maximum number");
		}
		else 
		{
			System.out.println("num2 is the maximum number");
		}
	}
}

			
		
		
		
		
		
		
		
		