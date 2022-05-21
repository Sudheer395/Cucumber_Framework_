package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.screenshot;

public class Stores {
	public static WebDriver driver;

	public Stores(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='featuredLinksBar__link'])[1]")
	WebElement stores;

	@FindBy(xpath = "(//button[@class='_1fVSi action-button _1njbS _1XfDi _3J6Eb'])[1]")
	WebElement Address;
	@FindBy(xpath = "(//div[@class='info-section'])[1]")
	WebElement text;

	public void stores() throws InterruptedException {

		stores.click();
		Thread.sleep(3000);
		Address.click();
		screenshot.captureScreenshots(driver);

		String uiText = text.getText();
		System.out.println(uiText);
		driver.navigate().back();
		driver.navigate().back();

	}

}
