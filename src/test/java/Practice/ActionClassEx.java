package Practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassEx {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Example of moveToElement
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
		Actions act = new Actions(driver);
		act.moveToElement(data).perform();*/
		
		//Action methods--->sendkeys().perform().click().build().
		/*driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement USN = driver.findElement(By.id("username"));
		WebElement PWD = driver.findElement(By.name("pwd"));
		WebElement Login = driver.findElement(By.xpath("//div[text()='Login ']"));
			
		Actions act = new Actions(driver);
		//act.sendKeys(USN,"admin").perform();
		//act.sendKeys(PWD,"manager").perform();
		//act.sendKeys(Login).click().perform();
		act.sendKeys(USN,"admin").sendKeys(PWD,"manager").sendKeys(Login).click().build().perform();
		
		//ActionMethod----->contextClick()
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
		Actions act = new Actions(driver);
		act.contextClick(data).perform();*/
		
		//Example of----> dragAndDrop
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));*/
		
		//Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).perform();
		/*act.clickAndHold(drag).perform();
		act.release(drop).perform();*/
		/*driver.get("https://jqueryui.com/droppable ");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("Drop here"));
		act.dragAndDrop(drag, drop).perform();*/
		
		driver.get("//https://demo.guru99.com/test/simple_context_menu.html");
		
	}

}//https://demo.guru99.com/test/simple_context_menu.html 
