package parentchild;

public class Child extends Parent {
	
	public void marriage() {
		System.out.println("Marriage by Child method ");
	}

	@Override
	public void property() {
		System.out.println("Child's property overridden");
		super.property();
	}
	
}
