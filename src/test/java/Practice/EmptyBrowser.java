package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		
		//get()---> used for launching web application
		driver.get("https://www.amazon.in/");
		
		//getTitle()---> used to get the title of the webpage
		String title=driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl()---> used to get the url of the webapplication
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//getPageSource()---> used to print the source code of the webpage
		String data=driver.getPageSource();
		System.out.println(data);
		
		//close()--->close only focused tab/windows
		//driver.close();
		
		//quit()--->close entire tabs/windows
		driver.quit();
		
		
	}

}
