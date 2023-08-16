package Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("[class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Tricycles & Rideons\"]")).click();
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   for(int i=0;i<1;i++)
	   {   
		   js.executeScript("window.scrollBy(0,500)");
		   Thread.sleep(1000);
	   }
       
	}

}
