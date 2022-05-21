package Framework;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.ReadExcel;
import io.cucumber.java.Before;

public class BaseClass{
	
	public static WebDriver driver;
	
	 @Before
	 public WebDriver setup() throws IOException {

	       // Initialize the webdriver and open the browser
		   SiteReusable objSiteReusable = new SiteReusable(driver);
		   Map<String, String> props = objSiteReusable.getProperties();
		   if(props.get("BrowserName").contains("chrome") && props.get("webDriver").contains("chrome")) {
		       System.setProperty("webdriver.chrome.driver", props.get("driverPath"));
		       driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.get(props.get("url"));
		   }
		   
		   ReadExcel excelData = new ReadExcel();
		   excelData.loadExcelData();
		   return driver; 
	   }
}