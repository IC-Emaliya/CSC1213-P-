import java.util.Scanner;
class D4EX1
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number to find summation:");
		int n=ob.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Summation of the numbers:"+sum);
	}
}
