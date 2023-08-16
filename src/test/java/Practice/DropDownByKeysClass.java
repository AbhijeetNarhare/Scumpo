package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownByKeysClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement daylist = driver.findElement(By.id("day"));
		Thread.sleep(2000);
		daylist.click();
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.click();
		
		Thread.sleep(1000);
		WebElement monthlist = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Thread.sleep(1000);
		monthlist.click();
		monthlist.sendKeys(Keys.ARROW_DOWN);
		monthlist.sendKeys(Keys.ARROW_DOWN);
		monthlist.sendKeys(Keys.ARROW_DOWN);
		monthlist.sendKeys(Keys.ARROW_DOWN);
		
		
		
	}

}
