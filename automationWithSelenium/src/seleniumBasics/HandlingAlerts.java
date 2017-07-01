package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://www.javascriptkit.com/javatutors/alert2.shtml");

			//The sleep time is added to slow down the execution 
			//so that we can see what's happening
			Thread.sleep(3000);

			//Alert Accept
			WebElement alertBox1=	driver.findElement(By.name("B3"));
			alertBox1.click();
			Thread.sleep(2000);
			Alert alert= driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			// The second accept is because, the example
			// website is showing one more
			alert.accept(); 
			Thread.sleep(2000);

			//Alert Dismiss
			WebElement alertBox2=	driver.findElement(By.name("B3"));
			alertBox2.click();
			Thread.sleep(2000);
			alert.dismiss();
			Thread.sleep(2000);
			alert.accept();

			//send input to alert
			WebElement alertBox3=	driver.findElement(By.name("B4"));
			alertBox3.click();
			Thread.sleep(2000);
			alert.sendKeys("Agni");
			alert.accept();
			Thread.sleep(2000);
			alert.accept();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


