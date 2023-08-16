package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceSele {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 driver.get("http://localhost:8888/");
	 driver.findElement(By.cssSelector("[name=\"user_name\"]")).sendKeys("admin");
	 driver.findElement(By.cssSelector("[name=\"user_password\"]")).sendKeys("admin");
	 driver.findElement(By.cssSelector("[id=\"submitButton\"]")).click();
	 
	/*//Navigate to Contacts link
	 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	 
	 //Click on Create contact look Up Image
	 driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	 
	 //Create Contact with Mandatory fields
	 driver.findElement(By.cssSelector("[name=\"lastname\"]")).sendKeys("Dinga");
	 //Save and Verify
	 driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	 //logout of Application
//driver.findElement(By.xpath("(//img[@border='0'])[3]]")).click();*/

	  
	/*/Navigate to Organizations link 
	 driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	 
	 //Click on Create Organization look Up Image 
     driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
     
     //create new organization
     driver.findElement(By.cssSelector("[name=\"accountname\"]")).sendKeys("KungFu");
     driver.findElement(By.cssSelector("[name=\"website\"]")).sendKeys("www.kungfu.com");
     
   //Save and Verify
     driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")).click();*/
    		 
  

     
	}

}
