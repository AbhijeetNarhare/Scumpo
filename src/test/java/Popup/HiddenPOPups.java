package Popup;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

public class HiddenPOPups {

	public static void main(String[] args) {
 
	        EdgeDriver driver;
	        WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.get("https://demo.actitime.com/login.do");
	        driver.manage().window().maximize();
	        
	        
	        driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	        
	        driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	        driver.findElement(By.xpath("//div[@class='checkbox inactive']")).click();
	        
	        
	
	}
}

