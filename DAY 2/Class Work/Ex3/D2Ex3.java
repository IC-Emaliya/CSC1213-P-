import java.util.Scanner;
class D2Ex3
{
public static void main(String []args)
{
	String fname;
	
	Scanner sc =new Scanner (System.in);
	
	System.out.print("Enter your First Name:");
	fname=sc.nextLine();
	
    System.out.print("Enter your last name:");
	String Lname=sc.next();
	
	System.out.print("Enter your Marks:");
	int marks=sc.nextInt();
	
	System.out.println("Fullname:"+fname+" "+Lname+"\n"+"marks is:"+marks);
}
}
