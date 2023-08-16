package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggetion {

	public static void main(String[] args) throws Throwable {
		EdgeDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
         
         Thread.sleep(1000);
         driver.get("https://www.flipkart.com/");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
         WebElement data = driver.findElement(By.xpath("//input[@class='_3704LK']"));
         data.sendKeys("puma");
         Thread.sleep(1000);
         List<WebElement> suggetions = driver.findElements(By.xpath("//a[@class='_3izBDY']"));
         for(WebElement wb:suggetions)
         {
        	 Thread.sleep(2000);
        	 String text = wb.getText();
        	 if(text.contains("puma slides"))
        	 {
        		 Thread.sleep(1500);
        		 wb.click();
        		 break;
        		 
        	 }
        	 
         }

	}

}
