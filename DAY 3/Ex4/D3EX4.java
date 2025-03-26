import java.util.Scanner;
class D3EX4
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the charecter:");
		char vowels=ob.next() .charAt(0);
		
		switch(vowels)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println("It is vowel");
		break;
		default:System.out.println("Invalid");
		}
	}
}

		
      		
		