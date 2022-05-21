package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReferAndEarn {
public static WebDriver driver;
    
    public ReferAndEarn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[@href='/refer_and_earn?src=g_footer']")
	WebElement referEarnOpt;
	
	@FindBy(xpath = "(//li[@tabindex='0'])[1]") WebElement wedding;
	
	@FindBy(xpath = "//a[@href='https://www.urbanladder.com/multiply-tnc']") WebElement clickingHere;
	
	//@FindBy(xpath = "//li[contains(text(),'FOLLOWING TERMS AND CONDITIONS')]") WebElement paragraph;

    
    public void referAndEarn() throws InterruptedException{
    	
    	referEarnOpt.click();
    		Thread.sleep(3000);
    		Actions actions = new Actions(driver);
    		actions.moveToElement(clickingHere).perform();
       		Thread.sleep(3000);
       		clickingHere.click();
       		Thread.sleep(2000);
    		//System.out.println(paragraph.getText());
    		driver.navigate().back();
    }
}