class HwEx1
{
	public static void main(String args[])
	{
		int a=16;
		int b=4;
		int c=2;
		
		//unary Operators
		System.out.println("d="+(++a));
		
		//logical operators
		if(a>b&&b>c)
		    System.out.println("a is the greatest value");
		else
		    System.out.println("a is not the greatest value");
		
		//relational operators
		if(a!=b)
			System.out.println("a not equal to b");
		else
			System.out.println("a is equal to b");
		
		//assignment operators
	    b=b+c;
		System.out.println("b="+b);
		
		//Ternary operators
		if(b>c)
			System.out.println("greatest value is:"+b);
		else
			System.out.println("greatest value is:"+c);
		
    }
}
		
		