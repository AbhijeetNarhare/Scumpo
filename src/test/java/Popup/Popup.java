package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver ;
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE);
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		
		driver.findElement(By.cssSelector("[id=\"ext-gen7\"]")).click();
		driver.findElement(By.cssSelector("[name=\"name\"]")).sendKeys("abhi");
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();

	}

}
