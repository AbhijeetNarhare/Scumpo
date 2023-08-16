package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement2 {

	public static void main(String[] args) throws Throwable {
	//WebElement using cssValue()
         
		WebDriver driver ;
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
	 /*  driver.get("https://www.facebook.com/login/");
	   WebElement font = driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
	   String data = font.getCssValue("font-size");
	  System.out.println(data);
	
	WebElement color = driver.findElement(By.id("email"));
	String data1 = color.getCssValue("color");
	System.out.println(data1);*/
		
		//WebElement using sendKeys(),submit()
		
	/*driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[text()='â']")).click();
	WebElement value = driver.findElement(By.name("q"));
	value.sendKeys("puma");
	//value.click();
	value.submit();*/
		 
		/* driver.get("https://demo.actitime.com/login.do");
WebElement username = driver.findElement(By.cssSelector("input#username"));
username.sendKeys("admin");
Thread.sleep(1000);
username.clear();*/
	
		 
		// driver.get("https://www.facebook.com/login/");
		 
		 //getLocation()
	/*	WebElement data = driver.findElement(By.xpath("//a[.='à²à²¨à³à²¨à²¡']"));
		 Point location = data.getLocation();
		 System.out.println(location.getX());
		 System.out.println(location.getY());
		 System.out.println(location);
		 
		 WebElement data1 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		  Point value = data1.getLocation();
		
		  //getSize()
		  WebElement data2 = driver.findElement(By.xpath("//a[.='à²à²¨à³à²¨à²¡']"));
		 Dimension val = data2.getSize();
		 System.out.println(val.getHeight());
		 System.out.println(val.getWidth());
		 System.out.println(val);
	
	      //getRect()
		 WebElement data3 = driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
	            Rectangle rec = data3.getRect();
	            System.out.println(rec.getX());
	            System.out.println(rec.getY());
	            System.out.println(rec.getHeight());
	            System.out.println(rec.getWidth());*/
	
	
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
/*	WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	if(logo.isDisplayed())
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is not displayed");
	}*/
	
	//isEnabled()
	/*WebElement data = driver.findElement(By.id("username"));
	if(data.isEnabled())
	{
		data.sendKeys("admin");
		}
	else
	{
		System.out.println("not enabled");
	}*/
	
	//isSelected()
	/*WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkBox.click();
	if(checkBox.isSelected())
	{
		System.out.println("checked");
	}
	else
	{
		System.out.println("not checked");
	}*/
	
	//getAttribute()
/*	WebElement data = driver.findElement(By.id("username"));
	String value = data.getAttribute("id");
	System.out.println("Attribute value for id is:"+value);*/
	
	/*WebElement attribute = driver.findElement(By.name("pwd"));
	String value1 = attribute.getAttribute("class");
	System.out.println(value1);*/
	
	
	//getTagName()
	/*WebElement data = driver.findElement(By.id("loginButton"));
	String value = data.getTagName();
	System.out.println(value);*/
 
	//getArialRole()
	/*WebElement data = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	String value = data.getAriaRole();
	System.out.println(value);
	
	WebElement data1 = driver.findElement(By.id("loginButton"));
	String value1 = data1.getAriaRole();
	System.out.println(value1);
	
	WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkBox.getAriaRole());
	
	WebElement acttime = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	System.out.println(acttime.getAriaRole());*/
	
	/*WebElement data = driver.findElement(By.id("username"));
	data.sendKeys("admin");
	System.out.println(data.getDomAttribute("class"));*/
	
	WebElement dat = driver.findElement(By.id("username"));
	System.out.println(dat.getText());
	
	
	
	WebElement attribute = driver.findElement(By.name("pwd"));
	System.out.println(attribute.getText());
	
	WebElement data1 = driver.findElement(By.id("loginButton"));
	System.out.println(data1.getText());
	}
}

