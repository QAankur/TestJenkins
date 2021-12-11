package uitest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {

	@Parameters({"Browser"})
	@Test
	public void m1(String browser)
	{
		System.out.println("Passed value for parameters is" + browser);
		System.out.println("Jenkins is up and running and working");
		System.out.println("Adding this line to test webhooks");
	}
}
