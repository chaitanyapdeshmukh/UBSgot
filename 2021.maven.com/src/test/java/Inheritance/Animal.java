package Inheritance;

public class Animal {
	
	private Animal(){
		System.out.println("Anirmal Constructor");
	}
	
	public void eat() {
		System.out.println("eat");
	}
	
	private void animalPrivateMethod() {
		System.out.println("private method of animal");
	}
	
	
	public static void main(String args[]) {
	
		Animal ani = new Animal();
		ani.animalPrivateMethod();
	
	}
}
