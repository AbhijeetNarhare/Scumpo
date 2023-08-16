package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysClass {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		/*//case;-1
		driver.findElement(By.name("username")).sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		password.sendKeys(Keys.ENTER);*/
		
		/*//case:-2
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);*/
		
		/*//case:-3
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);*/
		
		//case:-4
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE);
		
	}

}
