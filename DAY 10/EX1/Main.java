class Animal
{
	public void AnimalSound()
	{
		System.out.println("The Animal makes sound");
	}
}
class Pig extends Animal
{
	public void AnimalSound()
	{
		System.out.println("The Pig says:Wee wee");
	}
}
class Dog extends Animal
{
	public void AnimalSound()
	{
		System.out.println("The Dog says:Bow bow");
	}
}
class Main
{
	
    public static void main(String [] args)
    {
		Animal myAnimal=new Animal();
		myAnimal.AnimalSound();
		Pig myPig=new Pig();
		myPig.AnimalSound();
		Dog myDog=new Dog();
		myDog.AnimalSound();
	}
}
		
	
	