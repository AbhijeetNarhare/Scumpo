package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//maximizing the screen
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector(""))
		
		//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		//driver.findElement(By.cssSelector("a#loginButton")).click();
	}

}
