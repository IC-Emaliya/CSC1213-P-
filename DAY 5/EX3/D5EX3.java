import java.util.Scanner;
class D5EX3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the integer:");
			numbers[i]=sc.nextInt();
	
		}
		int minimum=numbers[0];
		int maximum=numbers[0];
		for(int i=0;i<5;i++)
		{
			if(numbers[i]<minimum)
			{
				minimum=numbers[i];
			}
			if(numbers[i]>maximum)
			{
				maximum=numbers[i];
			}
		}
		
		System.out.println("Minimum is:"+minimum);
		System.out.println("Maximum is:"+maximum);
		
		
			
		
	}
}