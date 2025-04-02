import java.util.Scanner;
class D4EX3
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		char control=' ';
		int evencounter=0,oddcounter=0;
		int evensum=0,oddsum=0;
		
		
		do
		{
			System.out.println("Enter a number to find summation:");
			int n=ob.nextInt();
			if (n%2==0)
			{
				evencounter=evencounter+1;
				evensum=evensum+n;
			}
			else
			{
				oddcounter=oddcounter+1;
				oddsum=oddsum+n;
			}
				
				
			System.out.println("Do you want to continue:");
			control=ob.next().charAt(0);
		}
			
		
		while(control=='y'||control=='Y');
		System.out.println("No of even numbers"+evencounter);
		System.out.println("No of odd numbers"+oddcounter);
		System.out.println("Summation of even numbers"+evensum);
		System.out.println("Summation of odd numbers"+oddsum);
		
		
		
	}
}
