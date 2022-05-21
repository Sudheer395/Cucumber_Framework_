package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.screenshot;

public class SeatingAddtoCart {
	public static WebDriver driver;


	public SeatingAddtoCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/chair?src=explore_categories']")
	WebElement seatingIcon;

	@FindBy(xpath = "(//a[@href='/wing-lounge-chairs?src=cat_2'])[2]")
	WebElement LoungeOpt;
	
//	@FindBy(xpath = "(//div[@class='gname'])[2]")
//	WebElement price;
//	
//	@FindBy(xpath = "//li[@data-key='price_asc']")
//	WebElement priceAsc;
//	
//	@FindBy(xpath = "//button[@id='checkout-link']")
//	WebElement checkout;
	
	

	public void seating() throws InterruptedException {
		seatingIcon.click();
		Thread.sleep(3000);
		screenshot.captureScreenshots(driver);
	
	}

	public void Lounge() throws InterruptedException {
		LoungeOpt.click();
		Thread.sleep(3000);
		screenshot.captureScreenshots(driver);
		
	}

//	public void price() throws InterruptedException{
//		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(price).perform();
//		Thread.sleep(3000);
//		priceAsc.click();
//		Thread.sleep(3000);
//		
//	}



}
