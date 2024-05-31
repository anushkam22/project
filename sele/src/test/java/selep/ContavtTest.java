package selep;

import org.testng.annotations.Test;

public class ContavtTest {
	
	@Test(groups = {"smoke", "FR"})
	public void getContactTest()
	{
		System.out.println("execute con");
	}
	
	@Test(groups = "FR")
	public void getContactTestw()
	{
		System.out.println("execute con");
	}
	
	
	@Test(groups = "FR")
	public void getContactTestwo()
	{
		System.out.println("execute con");
	}
	
	@Test
	public void modifyTest()
	{
		System.out.println("modify con");
	}

}
