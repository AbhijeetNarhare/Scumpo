package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		//Launching the website
		driver.get("https://demo.automationtesting.in/Register.html");
		//maximizing the screen
		driver.manage().window().maximize();
		
		//Entering first name
		driver.findElement(By.cssSelector("[placeholder=\"First Name\"]")).sendKeys("ABC");
		
		//entering last name
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("XYZ");
		
		//Entering address
		driver.findElement(By.xpath("//textarea")).sendKeys("At.post-Sonvati,Ta/Dist-Latur ,Maharastra");
		
		//entering email id
		//driver.findElement(By.xpath("//input[contains(@class,'form-control ng-dirty ng-valid-r')]")).sendKeys("abhijitnarhare@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");
		
		//entering mobile no.
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9856252155");
		
		//profile photo
		//driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		
		
		
		//click on radio button
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		//click on checkbox
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		//select language
		//driver.findElement(By.xpath("//a[text()='English']")).click();
		/*WebElement lang = driver.findElement(By.id("[id=\"msdd\"]"));
		Thread.sleep(2000);
		lang .sendKeys(Keys.ARROW_DOWN);
		lang .sendKeys(Keys.ARROW_UP);
		lang .click();*/
		
		//select skills
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sel = new Select(skills);
		sel.selectByVisibleText("SQL");
		
		//countries
		driver.findElement(By.xpath("//select[@id='countries']")).click();
		
		
		
		WebElement conuntry = driver.findElement(By.xpath("//span[@tabindex='-1']"));
		Thread.sleep(2000);
		conuntry.sendKeys(Keys.ARROW_UP);
		conuntry.sendKeys(Keys.ARROW_UP);
		conuntry.click();
		
		//select date of birth
		WebElement year = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select yearlist = new Select(year);
		yearlist.selectByVisibleText("1925");
		
		driver.findElement(By.xpath("//option[@value='October']")).click();
		driver.findElement(By.xpath("//option[@value='18']")).click();
		    
				
		//create password
		driver.findElement(By.cssSelector("[id=\"firstpassword\"]")).sendKeys("12345");
		//confirm password
		driver.findElement(By.cssSelector("[id=\"secondpassword\"]")).sendKeys("12345");
		//submit
		driver.findElement(By.cssSelector("[id=\"submitbtn\"]")).click();
		
	
		
	}

}
