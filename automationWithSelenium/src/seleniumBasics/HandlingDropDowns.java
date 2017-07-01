package seleniumBasics;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://www.echoecho.com/htmlforms11.htm");

			//find the drop down first
			WebElement dropDown= driver.findElement(By.name("dropdownmenu"));
			
			//pass the web element to Select as below
			Select selectValue= new Select(dropDown);
			selectValue.selectByIndex(0);
			//sleep included to slow down the process
			Thread.sleep(2000);
			selectValue.selectByValue("Cheese");
			Thread.sleep(2000);
			selectValue.selectByVisibleText("Milk");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


