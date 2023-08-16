package org.openqa.selenium.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		/*WebElement font = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		Thread.sleep(1500);
		String data = font.getCssValue("font-size");
		System.out.println(data);
		
		WebElement colour = driver.findElement(By.cssSelector("[name=\"login\"]"));
		String data1 = colour.getCssValue("colour");
		System.out.println(data1);*/
		
		/*WebElement rct = driver.findElement(By.cssSelector("[name=\"login\"]"));
		Rectangle value = rct.getRect();
		 System.out.println("height=="+value.getHeight());
		 System.out.println("width=="+value.getWidth());
		 System.out.println("x=="+value.getX());
		 System.out.println("y=="+value.getY());
 
		WebElement logo = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		if (logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		} else
		{
           System.out.println("logo is not displayed");
		}*/
		driver.get("https://demo.actitime.com/login.do");
		   /* WebElement data = driver.findElement(By.id("username"));
		String value = data.getAttribute("id");
		System.out.println("Attribute value for id is:"+value);

		String value1 = data.getAttribute("type");
		System.out.println("Attribute value for type is:"+value1);

		WebElement idvalue = driver.findElement(By.id("loginButton"));
		    String value2 = idvalue.getAttribute("href");
		    System.out.println("value of href:"+value2);
		    
		    //output is Null
		    String val = idvalue.getAttribute("name");
		    System.out.println("value for name is:"+val);/*/
		    
				    WebElement data = driver.findElement(By.id("username"));
				    String value = data.getTagName();
				    System.out.println(value);
				    
				    WebElement idvalue = driver.findElement(By.id("loginButton"));
				   String tagname = idvalue.getTagName();
				   System.out.println(tagname);
	}

}
