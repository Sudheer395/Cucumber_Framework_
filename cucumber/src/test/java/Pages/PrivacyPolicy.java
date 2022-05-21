package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.screenshot;

public class PrivacyPolicy {
	public static WebDriver driver;

	public PrivacyPolicy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='/privacy-policy?src=g_footer']")
	WebElement privacy;
	
	@FindBy(xpath = "//div[@id='page_content']") WebElement page_content;
	
    public void privacy_policy() throws InterruptedException{
    	  privacy.click();
    		Thread.sleep(3000);
    		System.out.println("================================");
   		 System.out.println(page_content.getText());
   		screenshot.captureScreenshots(driver);
   		System.out.println("================================");
		driver.navigate().back();
    }
}