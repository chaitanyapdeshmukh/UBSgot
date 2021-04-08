package Inheritance;

public class ImplementingCar implements carInterface{

	@Override
	public void brandName() {
	System.out.println(brandName);
		
	}

	@Override
	public void auotmatic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gearSystem() {
		// TODO Auto-generated method stub
			
	}
	
	public void newcarMethod() {
		System.out.println(brandName);
	}

	public static void main(String args[]) {
		
		carInterface c = new ImplementingCar();
		c.brandName();
		
		
	}
	
	
}
