package org.openqa.selenium.interactions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


		public class WebElements {
			public static void main(String[] args) throws Throwable {
				   WebDriver driver =new EdgeDriver();
		           WebDriverManager.edgedriver().setup();
		           driver.get("https://www.facebook.com/");
					    //xpath by contains Attribute
					  /*WebElement font = driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
					   //cssValue (WebElement)
					   String data = font.getCssValue("font-size");
					   System.out.println(data);
					  
					   WebElement value = driver.findElement(By.xpath("//input[@name='email']"));
					   String data1 = value.getCssValue("color");
					   System.out.println(data1);*/
					   
					    //getLocation() (WebElement)
					/*  WebElement data = driver.findElement(By.xpath("//a[.='à²à²¨à³à²¨à²¡']"));
					   // WebElement data = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
					   Point value = data.getLocation();
					   System.out.println(value.getX());
					   System.out.println(value.getY());
					   System.out.println(value);
					   
					   //getSize()
					   WebElement data1 = driver.findElement(By.xpath("//a[.='à²à²¨à³à²¨à²¡']"));
					  // WebElement data1 = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
					    Dimension value1 = data1.getSize();
					    System.out.println(value1.getHeight());
					    System.out.println(value1.getWidth());
					    System.out.println(value1);
					   
					    //getRect()
					    WebElement data2= driver.findElement(By.xpath("//a[.='à²à²¨à³à²¨à²¡']"));
					   // WebElement data2 = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
					   Rectangle value2 = data2.getRect();
					   System.out.println(value2.getHeight());
					   System.out.println(value2.getWidth());
					   System.out.println(value2.getX());
					   System.out.println(value2.getY());*/
					
					   // driver.get("https://demo.actitime.com/login.do");
					/*   WebElement UN = driver.findElement(By.id("username"));
					   UN.sendKeys("admin");
					   Thread.sleep(1000);
					  //   UN.clear();
					     
					   //isdisplayed()
					     WebElement data = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
					      if(data.isDisplayed())
					     {
					    	 System.out.println("logo is displayed");
					     }
					     else
					     {
					    	 System.out.println("logo is not displayed");
					     }*/
					    
					    //isenabled()
					/* WebElement data = driver.findElement(By.id("username"));
					      if(data.isEnabled())
					   {
						   data.sendKeys("admin");
					   }
					   else
					   {
						   System.out.println("not enabled");
					   }
				 
					     //isSelected()
					   WebElement data1= driver.findElement(By.xpath("//input[@type='checkbox']"));
			       data1.click();
			       if(data1.isSelected())
			   {
				System.out.println("checkbox selected");
			}
			else
				{
				System.out.println("checkbox not selected");
			}*/
					    
					    //getAttribute()
				/*	    WebElement data = driver.findElement(By.id("username"));
			String value = data.getAttribute("id");
			System.out.println("Attribute value for id is:"+value);

			String value1 = data.getAttribute("type");
			System.out.println("Attribute value for type is:"+value1);

			WebElement idvalue = driver.findElement(By.id("loginButton"));
			    String value2 = idvalue.getAttribute("href");
			    System.out.println("value of href:"+value2);
			    
			    //output is Null
			    String val = idvalue.getAttribute("name");
			    System.out.println("value for name is:"+val);*/
			    
					   /* WebElement data = driver.findElement(By.id("username"));
					    String value = data.getTagName();
					    System.out.println(value);
					    
					    WebElement idvalue = driver.findElement(By.id("loginButton"));
					   String tagname = idvalue.getTagName();
					   System.out.println(tagname);*/
			}
			


	

	
	}


