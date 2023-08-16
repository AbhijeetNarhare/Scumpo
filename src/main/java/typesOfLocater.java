import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class typesOfLocater {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
	
		//maximizing the screem
		driver.manage().window().maximize();
		
		//example of id() locator
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//example of name() locator
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//example of class() locator
		//driver.findElement(By.className("textField")).sendKeys("doctor123");
		driver.findElement(By.id("loginButtonContainer")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("View Time-Track")).click();
		
		driver.findElement(By.partialLinkText("popup_menu_button popup_menu_button_se")).click();
		
		
		
	}

}
