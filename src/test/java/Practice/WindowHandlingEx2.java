package Practice;
import java.time.Duration;
import java.util.Set;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class WindowHandlingEx2 {

	public static void main(String[] args) throws Throwable {
		EdgeDriver driver;
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
      driver.findElement(By.xpath("//button[text()='click']")).click();
      Set<String> allIds = driver.getWindowHandles();
      for(String id:allIds)
      {
    	driver.switchTo().window(id);
    	String title = driver.getTitle();
    	System.out.println(title);
    	if (title.contains("selenium"))
    	{
			break;
		}
    	
      }
		
   

	}

}
