package seleniumBasics;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot {
	static WebDriver driver;
	public static void main(String[] args) {
		try{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
		    driver = new FirefoxDriver();
			driver.navigate().to("http://www.google.com");
			driver.findElement(By.name("textbox")).sendKeys("Bishop heber trichy");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				takeScreenshot();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	// This method will take the screenshot
	private static void takeScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//The below method will save the screen shot in d drive with name "screenshot.png"
		FileUtils.copyFile(scrFile, new File("D:\\snap.png"));

	}

}
