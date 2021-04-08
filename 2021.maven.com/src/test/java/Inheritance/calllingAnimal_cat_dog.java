package Inheritance;

public class calllingAnimal_cat_dog {

	public static void main(String args[]) {
		Animal an = new Animal();  //Constructor is private hence it NOT visible outside class
		an.eat();
		
		Animal ani = new Cat();
		ani.eat();
		ani.meow();
		
		Cat c = new Cat();
		c.meow();
		
		Cat c3 = new Animal();
		
	}
	
}
