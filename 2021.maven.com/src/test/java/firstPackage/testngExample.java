package firstPackage;

import org.testng.annotations.Test;

public class testngExample {
	
	@Test(priority=0)
	public void test()
	{
		System.out.println("Hello Java T point");
	}
	
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Print test 2 method");
	}

}
