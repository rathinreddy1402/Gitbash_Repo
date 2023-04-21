package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {

	@Test
	public void createContact()
	{
		
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
		Assert.assertEquals(true, false);
		System.out.println("Step4");
		System.out.println("Step5");
	}
	@Test
	public void modifyContact()
	{
		System.out.println("Step6");
		System.out.println("Step7");
	}
}
