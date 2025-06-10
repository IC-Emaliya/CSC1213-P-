interface Animal
{
	public void Animalsound();
	public void sleep();
}
class Pig implements Animal
{
	public void Animalsound()
	{
		System.out.println("The Pig says:Wee wee");
	}

    public void sleep()

	{
		System.out.println("Zzz");
	}
}
class Main
{
	public static void main(String [] args)
    {
		Pig p=new Pig();
		p.Animalsound();
		p.sleep();
	}
}
	