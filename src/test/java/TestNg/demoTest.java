package TestNg;

import org.testng.annotations.Test;


public class demoTest {
	@Test(invocationCount = 2)
	public void createContact()
	{
		System.out.println("contact created");
	}
	
	@Test(priority = 2)
	public void modifyContact()
	{
		System.out.println("contact modify");
	}
	
	@Test(priority = 1)
	public void deleteContact()
	{
		System.out.println("contact delete");
	}
}
