package testngTutorial;

import org.testng.annotations.Test;

public class FirstTestNGScript {
	
	
	
	@Test(invocationCount=10)
	public void LoginTest()
	{
		System.out.println("sdhgdj");
	}
	
	@Test(dependsOnMethods ="LoginTest")
	public void AddUsidPwd()
	{
		
	}
	
	@Test
	public void Submit()
	{
		
	}

}
