import java.util.Scanner;
class D3EX1
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Input an Integer:");
		int n=ob.nextInt();
		
		if(n>0)
		{
			System.out.println("It is positive");
		}
		else if(n<0)
		{
			System.out.println("It is Negative");
		}
		else
		{
			System.out.println("It is zero");
		}
	}
}
