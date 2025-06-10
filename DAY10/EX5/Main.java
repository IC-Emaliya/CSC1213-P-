interface FirstInterface
{
	public void myMethod();
}
interface SecondInterface
{
	public void myotherMethod();
}
class Democlass implements FirstInterface,SecondInterface
{
	public void myMethod()
	{
		System.out.println("some text...");
	}
	public void myotherMethod()
	{
		System.out.println("some other text...");
	}
}
class Main
{
	public static void main(String [] args)
    {
		Democlass d=new Democlass();
		d.myMethod();
		d.myotherMethod();
		
	}
}
