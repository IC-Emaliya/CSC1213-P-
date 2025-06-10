abstract class Animal
{
	public abstract void animalsound();
	
	public void sleep()
	{
		System.out.println("Zzz");
	}
}
class AnimalAb
{
	public static void main(String [] args)
    {
		Animal a=new Animal();
		a.animalsound();
		a.sleep();
	}
}
	