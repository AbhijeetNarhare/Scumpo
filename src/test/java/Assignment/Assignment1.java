package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		//maximizing the screen
		driver.manage().window().maximize();
		
		//removing the add
		/*by cssSelector
		//driver.findElement(By.cssSelector("[class=\"_2KpZ6l _2doB4z\"]")).click();
		
		//xpath by using Attribute
		//syntax--->//htmltag[AttributeName='AttributeValue']
	
	    //xpath by using visible text
		//syntax--->//htmltag[text()='AttributeValue']
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//xpath by using contains Attribute
		//syntax--->//htmltag[contains(@AttributeName,'AttributeValue')]*/
		
		//xpath by using contains Visible text
		//syntax--->//htmltag[contains(text(),'AttributeValue')]
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		//click on mobile
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	}

}
