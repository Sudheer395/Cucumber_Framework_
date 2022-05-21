package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.screenshot;

public class TvUnits {
	public static WebDriver driver;


	public TvUnits(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/tv-units?src=explore_categories']")
	WebElement TvIcon;

	@FindBy(xpath = "//input[@id='filters_availability_In_Stock_Only']")
	WebElement checkbox;
	@FindBy(xpath = "(//span[@itemprop='name'])[5]")
	WebElement firstItem;

	public void TvUnits() throws InterruptedException {

		TvIcon.click();
		Thread.sleep(3000);
		checkbox.click();
		Thread.sleep(3000);
		System.out.println(firstItem.getText());
		screenshot.captureScreenshots(driver);
		checkbox.click();
		Thread.sleep(3000);
		System.out.println(firstItem.getText());
		screenshot.captureScreenshots(driver);
	}



}
