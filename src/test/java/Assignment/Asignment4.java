package Assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Asignment4 {

	


	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class=\"_2KpZ6l _2doB4z\"]")).click();
		WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		search.sendKeys("iphone");
		search.submit();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	     List<WebElement> model = driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']"));
	    List<WebElement> price = driver.findElements(By.xpath("//div[@class='col col-5-12 nlI3QM']//div [@class='_25b18c']"));
		for(int i=0; i<model.size(); i++)
		{
			
			 System.out.println(model.get(i).getText() + "\t" + price.get(i).getText());
        }
		}
		
		
	}


