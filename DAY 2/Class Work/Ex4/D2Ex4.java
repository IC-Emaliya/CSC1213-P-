import java.util.Scanner;
class D2Ex4
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
	
	System.out.print("Enter your Reg no:");
	String regno=sc.next();
	
	System.out.print("Enter your Age:");
	int age=sc.nextInt();
	
	System.out.print("Enter your sex:");
	char sex=sc.next().charAt(0);
	
	System.out.print("Enter your mobile no:");
	long phoneno=sc.nextLong();
	
	System.out.print("Enter your GPA:");
	double gpa=sc.nextDouble();
	
	System.out.println("Fullname:"+fname+" "+Lname+"\n"+"marks is"+marks+"\n"+"your Reg no:"+regno+"\n"+"your age:"+age+"\n"+"sex:"+sex+"\n"+"mobile no:"+phoneno+"\n"+"Your GPA:"+gpa);
	
}
}
