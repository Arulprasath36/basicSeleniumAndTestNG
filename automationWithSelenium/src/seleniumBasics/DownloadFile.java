package seleniumBasics;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFile {
	public static String downloadLocation = "D:\\";
	public static void main(String[] args) {
		try{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.java2s.com/Code/Jar/o/Downloadojdbc14jar.htm");
		
		WebElement downloadLink = driver.findElement(By.xpath("/html/body/div/div/div[2]/a"));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", downloadLink);
		
		Thread.sleep(2000);
		
		downloadLink.click();
		
		//to handle windows based control we can use Robot class.
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}


