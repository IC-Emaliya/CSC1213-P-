abstract class Animal
{
	public abstract void animalsound();
	
	public void sleep()
	{
		System.out.println("Zzz");
	}
}
class Pig extends Animal
{
	public void animalsound()
	{
		System.out.println("The Pig says:Wee wee");
	}
}
class AnimalAb
{
	public static void main(String [] args)
    {
		Pig p=new Pig();
		p.animalsound();
		p.sleep();
	}
}