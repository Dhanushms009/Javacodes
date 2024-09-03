import java.util.Scanner;
class Animal{
	void makesound()
	{
		System.out.println("Animal");
	}
}

class Cat extends Animal{
	void makesound()
	{
		System.out.println("Bark");
	}
}

class Animals
{
	public static void main(String[] args)
	{
		Cat c = new Cat();
		Animal a=new Animal();
		c.makesound();
		a.makesound();
	}
}
		
		