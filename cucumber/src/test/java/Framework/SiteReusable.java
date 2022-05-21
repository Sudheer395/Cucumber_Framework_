package Framework;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;

public class SiteReusable{
	public static Map<String, String> props=new HashMap<String, String>();
	public static String BrowserName;
	public static String webDriver;
	public static String url;
	public static WebDriver driver;
	String driverPath = "C:\\Eclipse workspace\\Comprehensive_Framework\\chromedriver.exe";
	
	public SiteReusable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	
	public static Map<String, String> getProperties() {
		Map<String, String> props = new HashMap<String, String>();
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("C:\\Users\\mindsdet355\\Downloads\\cucumber\\src\\test\\resources\\config\\ci\\config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String key : prop.stringPropertyNames()) {
			String value = prop.getProperty(key);
			props.put(key, value);
		}
		return props;
	}
	
	static {
		props = getProperties();
		System.out.println(props);
		BrowserName = props.get("BrowserName");
		webDriver = props.get("webDriver");
		url = props.get("url");
	}
	
	
	
	public void close() {
		driver.quit();
	}
}