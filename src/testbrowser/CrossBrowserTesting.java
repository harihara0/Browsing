package testbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting
{
 WebDriver driver;
@Test
@Parameters("browser")
public void VerifyTitle(String browsername) throws InterruptedException
{
 if(browsername.equalsIgnoreCase("chrome"))
 {
	 Thread.sleep(1000);
	 System.setProperty("webdriver.chrome.driver",
		      "C:\\Users\\91891\\Desktop\\JHHR\\selenium\\browser\\"
		      + "chrome\\chromedriver.exe");
	 driver = new ChromeDriver();
 }
 else
 {
	 if(browsername.equalsIgnoreCase("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\91891\\Desktop\\JHHR\\selenium\\browser\\"
		 		+ "geckodriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	 }
 }
 driver.get("http://the-internet.herokuapp.com/key_presses");
	WebElement keypad =driver.findElement(By.xpath("//input[@id='target']"));
	Actions act = new Actions(driver);
	act.moveToElement(keypad).click().perform();

	act.sendKeys(Keys.ENTER).perform();
	act.sendKeys(Keys.ARROW_RIGHT).perform();
	System.out.println(driver.getTitle());
	
	System.out.println("over");
	

	
}
}
