package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageLogin {
	public HomePageLogin(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
		
	}

	
	
}
