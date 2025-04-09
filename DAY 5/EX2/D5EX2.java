import java.util.Scanner;
class D5EX2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter the integer:");
			numbers[i]=sc.nextInt();
		}
		for(int number:numbers)
		{
			System.out.print(number+"\t");
		}
		
		System.out.println();
		String [] days= new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friay";
		days[5]="Saturday";
		days[6]="Sunday";
		
		for(String day:days)
		{
			System.out.println(day);
		}
	}
}









		

