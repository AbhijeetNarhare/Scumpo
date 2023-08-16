package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBySelectindex {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement daylist = driver.findElement(By.id("day"));
		
		//select by indexclass
		Select sel = new Select(daylist);
		sel.selectByIndex(8);
		
		WebElement monthlist = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select sele = new Select(monthlist);
		sele.selectByIndex(4);
		
				
		/*WebElement daylist = driver.findElement(By.id("day"));
		Select sel = new Select(daylist);
		sel.selectByValue("5");
		
		WebElement monthlist = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sele = new Select(monthlist);
		sele.selectByValue("5");
		
		WebElement year = driver.findElement(By.id("year"));
		Select selec = new Select(year);
		selec .selectByValue("2010");*/
		
		//select by visible text
		/*WebElement daylist = driver.findElement(By.id("day"));
		Select sel = new Select(daylist);
		sel .selectByVisibleText("7");
		
		WebElement monthlist = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sele = new Select(monthlist);
		sele.selectByVisibleText("Sep");
		
		WebElement year = driver.findElement(By.id("year"));
		Select selec = new Select(year);
		selec .selectByVisibleText("2009");*/
	}

}
