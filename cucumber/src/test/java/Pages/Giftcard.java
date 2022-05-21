package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Giftcard {
public static WebDriver driver;
    
    public Giftcard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[contains(@href,'gift-cards?src=g_footer')]")
	WebElement giftCard;
	
	@FindBy(xpath = "(//li[@tabindex='0'])[1]") WebElement wedding;
	
	@FindBy(xpath = "(//button[@tabindex='-1'])[1]") WebElement choose;
	
	@FindBy(xpath = "(//h2[@class='_FCNL'])[2]") WebElement text;

    
    public void gift_card() throws InterruptedException{
    	
    		giftCard.click();
    		Thread.sleep(3000);
    		Actions actions = new Actions(driver);
    		actions.moveToElement(wedding).perform();
       		Thread.sleep(3000);
       		choose.click();
       		Thread.sleep(2000);
    		String ExpectedText = "2. Now, customise your gift card";
    		Assert.assertEquals(ExpectedText, text.getText());
    		System.out.println("Clicked on wedding");
    		driver.navigate().back();
    }
}