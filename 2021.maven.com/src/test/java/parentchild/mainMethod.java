package parentchild;

import org.apache.maven.model.superpom.SuperPomProvider;

public class mainMethod {
	
	public static void main(String[] args) {
		Child c = new Child();
		
		Parent p = new Child();
		
		
		//verificaton of instanceof operator
		System.out.println("Check whether c is instance of Child class: ");
		System.out.println(c instanceof Child);
		
		System.out.println("Check whether c is instance of Parent class: ");
		System.out.println(c instanceof Parent);
		
		System.out.println("Check whether p is instance of Child clss");
		System.out.println(p instanceof Child);
		p.property();
		
		
		//instanceof operator that has null value returns false
		System.out.println("If we apply instanceof operator with a variable that have null value, it returns false. ");
		Child c2 = null;
		System.out.println(c2 instanceof Child);
		
	
	}

}
