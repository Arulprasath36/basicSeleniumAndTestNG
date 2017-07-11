package seleniumWithTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WhoIsThis {

	@Test
	@Parameters("Name")
	public void whoIsThis(String nameFromXml){
		System.out.println("I am "+ nameFromXml);
	}
	
}
