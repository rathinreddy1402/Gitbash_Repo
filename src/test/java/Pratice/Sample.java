package Pratice;

import org.testng.annotations.Test;


public class Sample {

	@Test(groups = "RegressionTest")
	public void createContact()
	{
		System.out.println("contact Created");
		
	}
	
	@Test(groups = "smokeTest")	
	public void modifyContact()
	{
		System.out.println("modified contact");
	}
	

	@Test(groups = "RegressionTest")
	public void deleteContact()
	{
		System.out.println("deleted contact");
	}
}
