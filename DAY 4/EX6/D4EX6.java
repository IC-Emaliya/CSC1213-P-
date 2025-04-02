import java.util.Scanner;
class D4EX6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int number[]=new int[size];
		
		//Taking input from users
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Enter the element"+(i+1)+":");
			number[i]=sc.nextInt();
		}
		
		//printing array elements
		System.out.println("\nArray elements:");
		for(int i=0;i<number.length;i++)
		{
			System.out.println(number[i]+"\t");
		}
		
		//logic for max,min,sum,avg
		int max=number[0];
		int min=number[0];
		int sum=0;
		double average;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>max)
			{
				max=number[i];
			}
			if(number[i]<min)
			{
				min=number[i];
			}
			sum=sum+number[i];
		}
		average=(double)sum/number.length;
		System.out.println("maximum:"+max);
	    System.out.println("minimum:"+min);
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+average);
		
		//search an element in array
		System.out.print("Enter the element you want to search:");
		int searchelement=sc.nextInt();
		boolean found=false;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==searchelement)
			{
				System.out.println("Element found at position:"+(i+1));
				found=true;
				break;
			}
		}
			if(!found)
			{
				System.out.println("Element not found");
			}
		
		
		//unique
		boolean unique=true;
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]==number[j])
				{
					unique=false;
					break;
				}
				if(!unique)
				{break;}
			}
		}
			if(unique)
			{
				System.out.println("Elements are unique");
			}
			else
			{
				System.out.println("Elements are not unique");
			}
		
	}
}
				
				
			
			
		