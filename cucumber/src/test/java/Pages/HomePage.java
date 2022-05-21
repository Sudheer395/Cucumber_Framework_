package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;


import Framework.SiteReusable;

import java.util.*;

import org.junit.Assert;
 
public class HomePage {
 
    public static WebDriver driver;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//section[contains(@class,'header__topBar')]/..")
    WebElement homePageHeader;
    
    @FindBy(xpath = "//div[contains(@class,'roundicon-bubble')]")
    WebElement videoCall;
    
    @FindBy(xpath = "//div[contains(@id,'chat-icon')]")
    WebElement chatIcon;
    
    public void validateHomePage() {
    	String current_url = driver.getCurrentUrl();
    	Assert.assertTrue(current_url.contains(SiteReusable.url));
    }
    
    public boolean checkPageIsLoaded() {
    	if(homePageHeader.isDisplayed()) {
    		return true;
    	}
    	return false;
    }

	public void checkHomePageHeaderElements(String expected_header) throws InterruptedException {
		Actions actions = new Actions(driver);
		List<WebElement> headerElements = driver.findElements(By.xpath("//li[contains(@class,'topnav_')]"));
		for(int i=0;i<headerElements.size();i++) {
			actions.moveToElement(headerElements.get(i)).perform();
			String uiText = headerElements.get(i).getText();
			System.out.println(uiText);
			Assert.assertTrue(expected_header+" Expected header value not found "+uiText,expected_header.contains(uiText));
			Thread.sleep(3000);
		}
	}

	public void checkHomePageFooterElements(String expected_footer) throws InterruptedException {
		Actions actions = new Actions(driver);
		List<WebElement> footerElements = driver.findElements(By.xpath("//div[contains(@class,'footer-item')]"));
		for(int i=0;i<footerElements.size();i++) {
			String uiText = footerElements.get(i).getText().replace(":", "");
			actions.moveToElement(footerElements.get(i)).perform();
			System.out.println(uiText);
			Assert.assertTrue(expected_footer+" Expected footer value not found "+uiText,expected_footer.contains(uiText));
			Thread.sleep(1000);
		}
	}
	
	public void checkHomePageInformationElements(String expected_Information) {
		List<WebElement> additionalInfoElements = driver.findElements(By.xpath("//div[contains(@class,'category-heading')]"));
		for(int i=0;i<additionalInfoElements.size();i++) {
			String uiText = additionalInfoElements.get(i).getText().replace(":", "");
			System.out.println(uiText);
			Assert.assertTrue(expected_Information+" Expected additional footer value not found "+uiText,expected_Information.contains(uiText));
		}
		
	}

	public void validateCallAndChatIcons() throws InterruptedException {
		
		Assert.assertTrue("Video and chat Icon are not visible",videoCall.isDisplayed());
		System.out.println("Video call and chat option are visible");
	}
}