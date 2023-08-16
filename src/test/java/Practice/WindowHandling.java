package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws Throwable {
		EdgeDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebElement jobs = driver.findElement(By.xpath("//div[.='Jobs']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(jobs).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Jobs by skill']")).click();
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
 
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		for(String id:allIds)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@title='FIND JOBS']")).click();
				
				
			}
		}
		driver.switchTo().window(mainId);
		driver.quit();
		
		
		
	
	}

}
