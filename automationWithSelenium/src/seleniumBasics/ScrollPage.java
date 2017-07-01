package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.echoecho.com/htmlforms11.htm");
		
		//the below line executes to the bottom of the page
		((JavascriptExecutor) driver)
        .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		//scroll to a bring a portion of the page to view
		WebElement previousButton = driver.findElement(By.className("boxprevnext"));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", previousButton);
			
	}
}
