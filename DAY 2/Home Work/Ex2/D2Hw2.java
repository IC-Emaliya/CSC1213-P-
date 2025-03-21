import java.util.Scanner;
class D2Hw2
{
	public static void main(String args[])
	{
		Scanner ob =new Scanner(System.in);
	
        System.out.println("Enter an integer:");
	    int n=ob.nextInt();
	    System.out.println("number:"+n);
	
	    if((n%11==0)&&(n%5==0))
	    {
			System.out.println("it is divisible by 11 and 5");
	    }
	    else
	    {
		    System.out.println("it is not divisible by 11 and 5");
	    }
    }
}