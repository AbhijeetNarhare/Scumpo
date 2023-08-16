package FrameWork;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.LoginPage;

public class Property_Files {

	public static void main(String[] args) throws Throwable {
		EdgeDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		//for actitime
		FileInputStream fis = new FileInputStream("./Properties.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		LoginPage login = new LoginPage(driver);
		login.logToApplication(USERNAME, PASSWORD);
		
		/*driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
		//for flipkart*/
		
		
	}

}
