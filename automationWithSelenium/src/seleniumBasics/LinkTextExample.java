package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://www.google.com");

			WebElement searchBox=	driver.findElement(By.name("q"));
			searchBox.sendKeys("Say Cheese!");

			WebElement searchIcon=driver.findElement(By.className("sbico-c"));
			searchIcon.click();

			Thread.sleep(2000);
			WebElement link=driver.findElement(By.linkText("Say cheese - Wikipedia"));
			link.click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
