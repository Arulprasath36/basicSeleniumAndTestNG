package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author Arulprasath
 *
 */
public class OpenGoogle {

public static void main(String[] args) throws InterruptedException {
	
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
/*		driver.findElement(By.name("q")).sendKeys("Bishop heber trichy");
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);*/
		//driver.close();
		driver.quit();
}

}
