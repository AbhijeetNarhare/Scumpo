package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement data = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		data.sendKeys("samsungtv");
		Thread.sleep(2000);
		List<WebElement> suggeestion = driver.findElements(By.tagName("div"));
		for(WebElement wb:suggeestion)
		{
			if(wb.getText().contains("samsung tv 4k"))
			{
				Thread.sleep(2000);
				wb.click();
				break;
			}
		
		}
		


	}
	
}


