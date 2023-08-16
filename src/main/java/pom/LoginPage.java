package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
		
	}
	
	//Declaration
	@FindBy(name="username")
	private WebElement UserTextField;
	
	@FindBy(name="pwd")
	private WebElement PasswordTextField;
	
	@FindBy(id="loginButton")
	private WebElement LoginButton;

	public void setUserTextField(WebElement userTextField) {
		UserTextField = userTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		PasswordTextField = passwordTextField;
	}

	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}
	//Bussiness Logics
	
	public void logToApplication(String username,String password) {
		UserTextField.sendKeys(username);
		PasswordTextField.sendKeys(password);
		LoginButton.click();
		
	}
	
	
	

}
