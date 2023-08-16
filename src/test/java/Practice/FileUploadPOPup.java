package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPOPup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=\"file\"]")).click();
		driver.get("\"C:\\Abhi\\1677588316804_Shri Niwas Villa  C Wing,Erandwane Pune (5).pdf\"");
	}

}
