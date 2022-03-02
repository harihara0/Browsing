package testbrowser;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newtab {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
			      "C:\\Users\\91891\\Desktop\\JHHR\\selenium\\browser\\"
			      + "chrome\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(2000);
			String TAB=Keys.chord(Keys.SHIFT,Keys.RETURN);
			driver.findElement(By.xpath("//b[normalize-space()='My Info']")).sendKeys(TAB);
			
		//	WebElement element=driver.findElement(By.xpath("//b[normalize-space()='My Info']"));
			/*Actions action = new Actions(driver);
		//
			
		     action.moveToElement(element);
		       action.keyDown(Keys.CONTROL);
		       action.click();

		       action.keyDown(Keys.CONTROL).build().perform();
		       Thread.sleep(2000L);
		       ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		       driver.switchTo().window(list.get(1));

		       
			//driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();*/


	}

}
