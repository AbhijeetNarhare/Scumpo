package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.html5.Location;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		//maximizing the screem
		driver.manage().window().maximize();
	
		driver.findElement(By.cssSelector("id=\"twotabsearchtextbox\"")).sendKeys("puma");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		
		WebElement data = driver.findElement(By.xpath("//a[@href=\"https://www.imdb.com\"]"));
		Point loc = data.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		WebElement logo = driver.findElement(By.xpath("//div[@class=\"nav-logo-base nav-sprite\"]"));
		if (logo.isDisplayed()) 
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo isnot displayed");
		}
		/*WebElement check = driver.findElement(By.xpath("//input[@type='text']"));
		check.getAriaRole();
		System.out.println(check);*/
		

	}

}
