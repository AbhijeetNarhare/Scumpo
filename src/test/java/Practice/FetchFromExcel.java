package Practice;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchFromExcel {

	public static void main(String[] args) throws Throwable {
		EdgeDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		FileInputStream fis = new FileInputStream("./Properties.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url1");
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Thread.sleep(1500);
		FileInputStream fes = new FileInputStream("C:\\Users\\abhijeet\\Downloads\\Book1.xlsx");

		Workbook book = WorkbookFactory.create(fes);
		Sheet sh = book.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		

		//Thread.sleep(1500);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(data);
		
		
		
	}

}
