package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownusingXpath {

	public static void main(String[] args) throws Throwable {	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
      Thread.sleep(1000);
      driver.findElement(By.xpath("(//a[@href=\"#\"])[2]")).click();
      Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='22']")).click();
		 driver.findElement(By.xpath("//option[text()='Aug']")).click();
		driver.findElement(By.xpath("//option[text()='2008']")).click();
		
	}

}
