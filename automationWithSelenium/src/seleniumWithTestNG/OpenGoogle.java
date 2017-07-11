package seleniumWithTestNG;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenGoogle {

	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	 static Logger log = Logger.getLogger(OpenGoogle.class);

	
	@BeforeSuite
	public void launchBrowser(){
		DOMConfigurator.configure("log4j.xml");
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
		// Launch the FireFox browser.
		log.info("Before opening Firefox");
		driver = new FirefoxDriver();
		log.info("Firefox opened");
		driver.manage().window().maximize();
	}

	@Test
	public void openGoogle(){
		
		log.info("Opening google.com");
		driver.get("http://www.google.com");	
	}
	
	@AfterSuite
	public void closeBrowser(){
		
		log.info("Work done");
		driver.quit();
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println(totalTime/1000.0+" seconds");
	}
}
