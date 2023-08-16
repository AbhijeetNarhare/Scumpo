package Practice;

 import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsExs {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		
		//getCssValue()--->WebElement
	/*	WebElement font = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		String data = font.getCssValue("font-size");
        System.out.println(data);
        
        WebElement text = driver.findElement(By.xpath("//input[@name='email']"));
        String color = text.getCssValue("color");
	    System.out.println(color);*/
		
		//sendkeys(),submit(),click()
	/*	driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(.,'â')]")).click();
	   WebElement search = driver.findElement(By.name("q"));
	   search.sendKeys("puma");
	  // search.click();
	   search.submit();*/
		
	/*	driver.get("https://www.amazon.in/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("nike");
		searchbox.submit();*/
		
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.cssSelector("input#username"));
		data.sendKeys("admin");
		Thread.sleep(3000);
		data.clear();*/
		
		//getLocation()--->webElement
	/*	driver.get("https://www.facebook.com/");
		WebElement data = driver.findElement(By.xpath("//a[.='à²à²¨à³à²¨à²¡']"));
		Point location = data.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		//getSize()----->WebElement
		 WebElement data2 = driver.findElement(By.xpath("//a[.='à²à²¨à³à²¨à²¡']"));
		Dimension size = data2.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//getRect()----->WebElement
		WebElement data3 = driver.findElement(By.xpath("//a[.='à²à²¨à³à²¨à²¡']"));
		Rectangle rec = data3.getRect();
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());*/
		
		
		driver.get("https://demo.actitime.com/login.do");
		/*WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("Logo not displayed");
		}*/
		
		/*WebElement username = driver.findElement(By.id("username"));
		if(username.isEnabled())
		{
			username.sendKeys("admin");
		}
		else
		{
			System.out.println("not enabled");
		}*/
		
		/*WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		if(check.isSelected())
		{
			System.out.println("box is checked");
		}
		else
		{
			System.out.println("box is not checked");
		}*/
		
		//getTagName()
	/*	WebElement data = driver.findElement(By.id("username"));
		String name = data.getTagName();
		System.out.println(name);
		
		WebElement data1 = driver.findElement(By.id("loginButton"));
		String value = data1.getTagName();
		System.out.println(value);*/
		
	/*	WebElement type = driver.findElement(By.id("username"));
		String value = type.getAriaRole();
		System.out.println(value);
		
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		String val = check.getAriaRole();
		System.out.println(val);*/
		
		//DOM:- Document object model
		//getDomAttribute()
	/*	WebElement data = driver.findElement(By.id("username"));
		data.sendKeys("admin");
		System.out.println(data.getDomAttribute("value"));*/
		
		//getDomProperty---->prints only for textbox field
//		WebElement data1 = driver.findElement(By.id("username"));
//		System.out.println(data1.getDomProperty("placeholder"));
//		
//		WebElement login = driver.findElement(By.id("loginButton"));
//		System.out.println(login.getDomProperty("class"));
//		
//		//getAttribute()
//		WebElement data = driver.findElement(By.id("username"));
//		System.out.println(data.getAttribute("class"));
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1000);
	WebElement tasklink = driver.findElement(By.cssSelector("a.reports"));
	System.out.println(tasklink.getText());

	}

}



