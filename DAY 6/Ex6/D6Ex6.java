import java.util.Scanner;
class D6Ex6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the row:");
		int row=sc.nextInt();
		System.out.println("Enter the size of the Column:");
		int column=sc.nextInt();
		
	    int marks[][]=new int [row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("Enter the integer:");
				marks[i][j]=sc.nextInt();
				
			}
		}
		int sum=0;
		int maximum=marks[0][0];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(marks[i][j]+" ");
				sum=sum+marks[i][j];
				if(marks[i][j]>maximum)
				{
					maximum=marks[i][j];
				}
				
			}
			System.out.println();
		}
		System.out.println("Total is:"+sum);
		System.out.println("Maximum is:"+maximum);
		
		
		
	
	}
}

		