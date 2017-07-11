package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://developer.mozilla.org/en/docs/Web/Events/mouseover");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		
		WebElement webTechnologiesLink= driver.findElement(By.linkText("Feedback"));
		actions.moveToElement(webTechnologiesLink);
		
		Thread.sleep(2000);
		
		WebElement tutorialsLink = driver.findElement(By.linkText("Tutorials"));
		actions.moveToElement(tutorialsLink);
		actions.click().build().perform();	
	
	}

}
