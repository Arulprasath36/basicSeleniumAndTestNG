package seleniumWithTestNG;

import org.testng.annotations.Test;

public class GroupTest {
	@Test (groups = { "Apple" })
	public void apple1() {
		System.out.println("Test Apple device 1");
	}

	@Test (groups = { "Apple" })
	public void apple2() {
		System.out.println("Test Apple device 2");
	}

	@Test (groups = { "MI" })
	public void mi1() {
		System.out.println("Test MI device 1");
	}

	@Test (groups = { "MI" })
	public void mi2() {
		System.out.println("Test MI device 2");
	}
	
	@Test (groups = { "Moto" })
	public void motog1() {
		System.out.println("Test Moto device 1");
	}
	
	@Test (groups = { "Moto" })
	public void motog2() {
		System.out.println("Test Moto device 2");
	}
	
	@Test (groups = { "Lenova" })
	public void lenova1() {
		System.out.println("Test Lenova device 1");
	}
	
	@Test (groups = { "Lenova" })
	public void lenova2() {
		System.out.println("Test Lenova device 2");
	}
}
