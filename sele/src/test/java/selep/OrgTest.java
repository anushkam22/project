package selep;

import org.testng.annotations.Test;

public class OrgTest{

	
	@Test
	public void getOrgTest()
	{
		System.out.println("execute org");
	}
	
	@Test(groups = "FR")
	public void modifyOrgTest()
	{
		System.out.println("modify org ");
	}

	
}
